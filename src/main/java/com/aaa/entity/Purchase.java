package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * purchase
 * @author 
 */
public class Purchase implements Serializable {
    private Integer purchaseId;

    private Integer itemId;

    private Integer companyId;

    private Integer purchaseNum;

    private Long purchasePrice;

    private Long purchaseSum;

    private String purchaseBuyer;

    private Date gmtCreate;

    private Date gmtModified;

    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getPurchaseSum() {
        return purchaseSum;
    }

    public void setPurchaseSum(Long purchaseSum) {
        this.purchaseSum = purchaseSum;
    }

    public String getPurchaseBuyer() {
        return purchaseBuyer;
    }

    public void setPurchaseBuyer(String purchaseBuyer) {
        this.purchaseBuyer = purchaseBuyer;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Purchase other = (Purchase) that;
        return (this.getPurchaseId() == null ? other.getPurchaseId() == null : this.getPurchaseId().equals(other.getPurchaseId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getPurchaseNum() == null ? other.getPurchaseNum() == null : this.getPurchaseNum().equals(other.getPurchaseNum()))
            && (this.getPurchasePrice() == null ? other.getPurchasePrice() == null : this.getPurchasePrice().equals(other.getPurchasePrice()))
            && (this.getPurchaseSum() == null ? other.getPurchaseSum() == null : this.getPurchaseSum().equals(other.getPurchaseSum()))
            && (this.getPurchaseBuyer() == null ? other.getPurchaseBuyer() == null : this.getPurchaseBuyer().equals(other.getPurchaseBuyer()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurchaseId() == null) ? 0 : getPurchaseId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getPurchaseNum() == null) ? 0 : getPurchaseNum().hashCode());
        result = prime * result + ((getPurchasePrice() == null) ? 0 : getPurchasePrice().hashCode());
        result = prime * result + ((getPurchaseSum() == null) ? 0 : getPurchaseSum().hashCode());
        result = prime * result + ((getPurchaseBuyer() == null) ? 0 : getPurchaseBuyer().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", purchaseId=").append(purchaseId);
        sb.append(", itemId=").append(itemId);
        sb.append(", companyId=").append(companyId);
        sb.append(", purchaseNum=").append(purchaseNum);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", purchaseSum=").append(purchaseSum);
        sb.append(", purchaseBuyer=").append(purchaseBuyer);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", operator=").append(operator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}