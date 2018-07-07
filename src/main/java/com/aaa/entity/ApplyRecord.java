package com.aaa.entity;

import java.io.Serializable;

/**
 * apply_record
 * @author 
 */
public class ApplyRecord implements Serializable {
    private Integer recordId;

    private Integer fettlerId;

    private Integer itemId;

    private Integer applyNum;

    private Integer realNum;

    private String dealMan;

    private Integer leftNum;

    private static final long serialVersionUID = 1L;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getFettlerId() {
        return fettlerId;
    }

    public void setFettlerId(Integer fettlerId) {
        this.fettlerId = fettlerId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    public Integer getRealNum() {
        return realNum;
    }

    public void setRealNum(Integer realNum) {
        this.realNum = realNum;
    }

    public String getDealMan() {
        return dealMan;
    }

    public void setDealMan(String dealMan) {
        this.dealMan = dealMan;
    }

    public Integer getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(Integer leftNum) {
        this.leftNum = leftNum;
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
        ApplyRecord other = (ApplyRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getFettlerId() == null ? other.getFettlerId() == null : this.getFettlerId().equals(other.getFettlerId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getApplyNum() == null ? other.getApplyNum() == null : this.getApplyNum().equals(other.getApplyNum()))
            && (this.getRealNum() == null ? other.getRealNum() == null : this.getRealNum().equals(other.getRealNum()))
            && (this.getDealMan() == null ? other.getDealMan() == null : this.getDealMan().equals(other.getDealMan()))
            && (this.getLeftNum() == null ? other.getLeftNum() == null : this.getLeftNum().equals(other.getLeftNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getFettlerId() == null) ? 0 : getFettlerId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getApplyNum() == null) ? 0 : getApplyNum().hashCode());
        result = prime * result + ((getRealNum() == null) ? 0 : getRealNum().hashCode());
        result = prime * result + ((getDealMan() == null) ? 0 : getDealMan().hashCode());
        result = prime * result + ((getLeftNum() == null) ? 0 : getLeftNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", fettlerId=").append(fettlerId);
        sb.append(", itemId=").append(itemId);
        sb.append(", applyNum=").append(applyNum);
        sb.append(", realNum=").append(realNum);
        sb.append(", dealMan=").append(dealMan);
        sb.append(", leftNum=").append(leftNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}