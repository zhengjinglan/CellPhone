package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * emp_income
 * @author 
 */
public class EmpIncome implements Serializable {
    private Integer incomeId;

    private Integer incomeTypeId;

    private Integer empId;

    private Long incomePrice;

    private Date gmtCreate;

    private Date gmtModified;

    private String operator;

    private static final long serialVersionUID = 1L;

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    public Integer getIncomeTypeId() {
        return incomeTypeId;
    }

    public void setIncomeTypeId(Integer incomeTypeId) {
        this.incomeTypeId = incomeTypeId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Long getIncomePrice() {
        return incomePrice;
    }

    public void setIncomePrice(Long incomePrice) {
        this.incomePrice = incomePrice;
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
        EmpIncome other = (EmpIncome) that;
        return (this.getIncomeId() == null ? other.getIncomeId() == null : this.getIncomeId().equals(other.getIncomeId()))
            && (this.getIncomeTypeId() == null ? other.getIncomeTypeId() == null : this.getIncomeTypeId().equals(other.getIncomeTypeId()))
            && (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getIncomePrice() == null ? other.getIncomePrice() == null : this.getIncomePrice().equals(other.getIncomePrice()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIncomeId() == null) ? 0 : getIncomeId().hashCode());
        result = prime * result + ((getIncomeTypeId() == null) ? 0 : getIncomeTypeId().hashCode());
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getIncomePrice() == null) ? 0 : getIncomePrice().hashCode());
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
        sb.append(", incomeId=").append(incomeId);
        sb.append(", incomeTypeId=").append(incomeTypeId);
        sb.append(", empId=").append(empId);
        sb.append(", incomePrice=").append(incomePrice);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", operator=").append(operator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}