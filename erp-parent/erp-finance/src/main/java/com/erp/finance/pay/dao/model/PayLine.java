/*
 * Copyright 2020-2021 redragon.dongbin
 *
 * This file is part of redragon-erp/赤龙ERP.

 * redragon-erp/赤龙ERP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.

 * redragon-erp/赤龙ERP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with redragon-erp/赤龙ERP.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.erp.finance.pay.dao.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="pay_line", schema="erp")
@DynamicInsert(true)
@DynamicUpdate(true)
public class PayLine implements java.io.Serializable {

    //serialVersionUID
    private static final long serialVersionUID = 1L;

    //Constructors
    public PayLine() {
    }
    
    //Fields
    
    //付款行id
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "pay_line_id", unique = true, nullable = false)
    private Integer payLineId;
    
    public Integer getPayLineId() {
        return this.payLineId;
    }
    public void setPayLineId(Integer payLineId) {
        this.payLineId = payLineId;
    }
    
    //付款行编码
    @Column(name = "pay_line_code", unique = true, nullable = false, length = 45)
    private String payLineCode;
    
    public String getPayLineCode() {
        return this.payLineCode;
    }
    public void setPayLineCode(String payLineCode) {
        this.payLineCode = payLineCode;
    }
    
    //付款头编码
    @NotBlank(message="付款头编码不能为空")
    @Column(name = "pay_head_code", unique = false, nullable = false, length = 45)
    private String payHeadCode;
    
    public String getPayHeadCode() {
        return this.payHeadCode;
    }
    public void setPayHeadCode(String payHeadCode) {
        this.payHeadCode = payHeadCode;
    }
    
    //付款来源行编码（采购订单行编码、入库单行编码）
    @NotBlank(message="付款来源行编码不能为空")
    @Column(name = "pay_source_line_code", unique = false, nullable = false, length = 45)
    private String paySourceLineCode;
    
    public String getPaySourceLineCode() {
        return this.paySourceLineCode;
    }
    public void setPaySourceLineCode(String paySourceLineCode) {
        this.paySourceLineCode = paySourceLineCode;
    }
    
    //发票行数量
    @NotNull(message="发票行数量不能为空")
    @Column(name = "quantity", unique = false, nullable = false)
    private Double quantity;
    
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    //行金额
    @NotNull(message="付款行金额不能为空")
    @Column(name = "amount", unique = false, nullable = false)
    private Double amount;
    
    public Double getAmount() {
        return this.amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    //税率（带小数）
    @NotNull(message="税率不能为空")
    @Column(name = "tax_rate", unique = false, nullable = false)
    private Double taxRate;
    
    public Double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
    
    //税额
    @NotNull(message="税额不能为空")
    @Column(name = "tax_amount", unique = false, nullable = false)
    private Double taxAmount;
    
    public Double getTaxAmount() {
        return taxAmount;
    }
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    //摘要
    @Column(name = "memo", unique = false, nullable = true, length = 200)
    private String memo;
    
    public String getMemo() {
        return this.memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    
    //版本
    @Column(name = "version", unique = false, nullable = false)
    private Integer version;
    
    public Integer getVersion() {
        return this.version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    //状态
    @Column(name = "status", unique = false, nullable = false, length = 10)
    private String status;
    
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    //创建时间
    @Column(name = "created_date", unique = false, nullable = false)
    private Date createdDate;
    
    public Date getCreatedDate() {
        return this.createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    //创建人
    @Column(name = "created_by", unique = false, nullable = false, length = 45)
    private String createdBy;
    
    public String getCreatedBy() {
        return this.createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    //最后修改时间
    @Column(name = "last_updated_date", unique = false, nullable = true)
    private Date lastUpdatedDate;
    
    public Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    
    //最后修改人
    @Column(name = "last_updated_by", unique = false, nullable = true, length = 45)
    private String lastUpdatedBy;
    
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
    //组织机构
    @Column(name = "org_code", unique = false, nullable = false, length = 10)
    private String orgCode;
    
    public String getOrgCode() {
        return this.orgCode;
    }
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    
    
    
    /*
         * 用于显示的字段
     */
    @Transient
    private String materialCode;
    @Transient
    private String materialName;
    @Transient
    private String standard;
    @Transient
    private Double price;
    @Transient
    private Double inputQuantity;
    @Transient
    private String unit;
    @Transient
    private Double poLineAmount;

    public String getMaterialCode() {
        return materialCode;
    }
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }
    public String getMaterialName() {
        return materialName;
    }
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getInputQuantity() {
        return inputQuantity;
    }
    public void setInputQuantity(Double inputQuantity) {
        this.inputQuantity = inputQuantity;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Double getPoLineAmount() {
        return poLineAmount;
    }
    public void setPoLineAmount(Double poLineAmount) {
        this.poLineAmount = poLineAmount;
    }
    public String getStandard() {
        return standard;
    }
    public void setStandard(String standard) {
        this.standard = standard;
    }
    
}