package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * parameter
 * @author 
 */
public class Parameter implements Serializable {
    private Integer parameterId;

    private Integer modelId;

    private String os;

    private String touchscreenType;

    private String resolvingPower;

    private String cpuBrand;

    private String cpuVersion;

    private String coreNum;

    private String ram;

    private String rom;

    private Date gmtCreate;

    private Date gmtModified;

    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getTouchscreenType() {
        return touchscreenType;
    }

    public void setTouchscreenType(String touchscreenType) {
        this.touchscreenType = touchscreenType;
    }

    public String getResolvingPower() {
        return resolvingPower;
    }

    public void setResolvingPower(String resolvingPower) {
        this.resolvingPower = resolvingPower;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public String getCpuVersion() {
        return cpuVersion;
    }

    public void setCpuVersion(String cpuVersion) {
        this.cpuVersion = cpuVersion;
    }

    public String getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(String coreNum) {
        this.coreNum = coreNum;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
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
        Parameter other = (Parameter) that;
        return (this.getParameterId() == null ? other.getParameterId() == null : this.getParameterId().equals(other.getParameterId()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getOs() == null ? other.getOs() == null : this.getOs().equals(other.getOs()))
            && (this.getTouchscreenType() == null ? other.getTouchscreenType() == null : this.getTouchscreenType().equals(other.getTouchscreenType()))
            && (this.getResolvingPower() == null ? other.getResolvingPower() == null : this.getResolvingPower().equals(other.getResolvingPower()))
            && (this.getCpuBrand() == null ? other.getCpuBrand() == null : this.getCpuBrand().equals(other.getCpuBrand()))
            && (this.getCpuVersion() == null ? other.getCpuVersion() == null : this.getCpuVersion().equals(other.getCpuVersion()))
            && (this.getCoreNum() == null ? other.getCoreNum() == null : this.getCoreNum().equals(other.getCoreNum()))
            && (this.getRam() == null ? other.getRam() == null : this.getRam().equals(other.getRam()))
            && (this.getRom() == null ? other.getRom() == null : this.getRom().equals(other.getRom()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParameterId() == null) ? 0 : getParameterId().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getOs() == null) ? 0 : getOs().hashCode());
        result = prime * result + ((getTouchscreenType() == null) ? 0 : getTouchscreenType().hashCode());
        result = prime * result + ((getResolvingPower() == null) ? 0 : getResolvingPower().hashCode());
        result = prime * result + ((getCpuBrand() == null) ? 0 : getCpuBrand().hashCode());
        result = prime * result + ((getCpuVersion() == null) ? 0 : getCpuVersion().hashCode());
        result = prime * result + ((getCoreNum() == null) ? 0 : getCoreNum().hashCode());
        result = prime * result + ((getRam() == null) ? 0 : getRam().hashCode());
        result = prime * result + ((getRom() == null) ? 0 : getRom().hashCode());
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
        sb.append(", parameterId=").append(parameterId);
        sb.append(", modelId=").append(modelId);
        sb.append(", os=").append(os);
        sb.append(", touchscreenType=").append(touchscreenType);
        sb.append(", resolvingPower=").append(resolvingPower);
        sb.append(", cpuBrand=").append(cpuBrand);
        sb.append(", cpuVersion=").append(cpuVersion);
        sb.append(", coreNum=").append(coreNum);
        sb.append(", ram=").append(ram);
        sb.append(", rom=").append(rom);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", operator=").append(operator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}