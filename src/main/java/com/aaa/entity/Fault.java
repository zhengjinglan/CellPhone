package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * fault
 * @author 
 */
public class Fault implements Serializable {
    private Integer faultId;

    private Integer typeId;

    private Integer modelId;

    private Long faultPrice;

    private String faultName;

    private String faultDescription;

    private Date gmtCreate;

    private Date gmtModified;

    private String predictionFault;

    private String predictionSolution;

    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getFaultId() {
        return faultId;
    }

    public void setFaultId(Integer faultId) {
        this.faultId = faultId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Long getFaultPrice() {
        return faultPrice;
    }

    public void setFaultPrice(Long faultPrice) {
        this.faultPrice = faultPrice;
    }

    public String getFaultName() {
        return faultName;
    }

    public void setFaultName(String faultName) {
        this.faultName = faultName;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
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

    public String getPredictionFault() {
        return predictionFault;
    }

    public void setPredictionFault(String predictionFault) {
        this.predictionFault = predictionFault;
    }

    public String getPredictionSolution() {
        return predictionSolution;
    }

    public void setPredictionSolution(String predictionSolution) {
        this.predictionSolution = predictionSolution;
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
        Fault other = (Fault) that;
        return (this.getFaultId() == null ? other.getFaultId() == null : this.getFaultId().equals(other.getFaultId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getFaultPrice() == null ? other.getFaultPrice() == null : this.getFaultPrice().equals(other.getFaultPrice()))
            && (this.getFaultName() == null ? other.getFaultName() == null : this.getFaultName().equals(other.getFaultName()))
            && (this.getFaultDescription() == null ? other.getFaultDescription() == null : this.getFaultDescription().equals(other.getFaultDescription()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getPredictionFault() == null ? other.getPredictionFault() == null : this.getPredictionFault().equals(other.getPredictionFault()))
            && (this.getPredictionSolution() == null ? other.getPredictionSolution() == null : this.getPredictionSolution().equals(other.getPredictionSolution()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFaultId() == null) ? 0 : getFaultId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getFaultPrice() == null) ? 0 : getFaultPrice().hashCode());
        result = prime * result + ((getFaultName() == null) ? 0 : getFaultName().hashCode());
        result = prime * result + ((getFaultDescription() == null) ? 0 : getFaultDescription().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getPredictionFault() == null) ? 0 : getPredictionFault().hashCode());
        result = prime * result + ((getPredictionSolution() == null) ? 0 : getPredictionSolution().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", faultId=").append(faultId);
        sb.append(", typeId=").append(typeId);
        sb.append(", modelId=").append(modelId);
        sb.append(", faultPrice=").append(faultPrice);
        sb.append(", faultName=").append(faultName);
        sb.append(", faultDescription=").append(faultDescription);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", predictionFault=").append(predictionFault);
        sb.append(", predictionSolution=").append(predictionSolution);
        sb.append(", operator=").append(operator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}