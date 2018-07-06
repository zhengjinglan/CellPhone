package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * order
 * 
 * @author
 */
public class Order implements Serializable {
	private Integer orderId;

	private Integer userId;

	private Integer fettlerId;

	private Long orderPrice;

	private String payWay;

	private Date gmtCreate;

	private Date gmtModified;

	private String state;

	private String assigner;

	private String predeterminedTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date realBegin;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date realEnd;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date assignTime;

	private String diagnosisResult;

	private String realSolution;

	private String address;

	private String color;

	private Long forecastPrice;

	private static final long serialVersionUID = 1L;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFettlerId() {
		return fettlerId;
	}

	public void setFettlerId(Integer fettlerId) {
		this.fettlerId = fettlerId;
	}

	public Long getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Long orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssigner() {
		return assigner;
	}

	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}

	public String getPredeterminedTime() {
		return predeterminedTime;
	}

	public void setPredeterminedTime(String predeterminedTime) {
		this.predeterminedTime = predeterminedTime;
	}

	public Date getRealBegin() {
		return realBegin;
	}

	public void setRealBegin(Date realBegin) {
		this.realBegin = realBegin;
	}

	public Date getRealEnd() {
		return realEnd;
	}

	public void setRealEnd(Date realEnd) {
		this.realEnd = realEnd;
	}

	public Date getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public String getDiagnosisResult() {
		return diagnosisResult;
	}

	public void setDiagnosisResult(String diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
	}

	public String getRealSolution() {
		return realSolution;
	}

	public void setRealSolution(String realSolution) {
		this.realSolution = realSolution;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getForecastPrice() {
		return forecastPrice;
	}

	public void setForecastPrice(Long forecastPrice) {
		this.forecastPrice = forecastPrice;
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
		Order other = (Order) that;
		return (this.getOrderId() == null ? other.getOrderId() == null : this
				.getOrderId().equals(other.getOrderId()))
				&& (this.getUserId() == null ? other.getUserId() == null : this
						.getUserId().equals(other.getUserId()))
				&& (this.getFettlerId() == null ? other.getFettlerId() == null
						: this.getFettlerId().equals(other.getFettlerId()))
				&& (this.getOrderPrice() == null ? other.getOrderPrice() == null
						: this.getOrderPrice().equals(other.getOrderPrice()))
				&& (this.getPayWay() == null ? other.getPayWay() == null : this
						.getPayWay().equals(other.getPayWay()))
				&& (this.getGmtCreate() == null ? other.getGmtCreate() == null
						: this.getGmtCreate().equals(other.getGmtCreate()))
				&& (this.getGmtModified() == null ? other.getGmtModified() == null
						: this.getGmtModified().equals(other.getGmtModified()))
				&& (this.getState() == null ? other.getState() == null : this
						.getState().equals(other.getState()))
				&& (this.getAssigner() == null ? other.getAssigner() == null
						: this.getAssigner().equals(other.getAssigner()))
				&& (this.getPredeterminedTime() == null ? other
						.getPredeterminedTime() == null : this
						.getPredeterminedTime().equals(
								other.getPredeterminedTime()))
				&& (this.getRealBegin() == null ? other.getRealBegin() == null
						: this.getRealBegin().equals(other.getRealBegin()))
				&& (this.getRealEnd() == null ? other.getRealEnd() == null
						: this.getRealEnd().equals(other.getRealEnd()))
				&& (this.getAssignTime() == null ? other.getAssignTime() == null
						: this.getAssignTime().equals(other.getAssignTime()))
				&& (this.getDiagnosisResult() == null ? other
						.getDiagnosisResult() == null : this
						.getDiagnosisResult()
						.equals(other.getDiagnosisResult()))
				&& (this.getRealSolution() == null ? other.getRealSolution() == null
						: this.getRealSolution()
								.equals(other.getRealSolution()))
				&& (this.getAddress() == null ? other.getAddress() == null
						: this.getAddress().equals(other.getAddress()))
				&& (this.getColor() == null ? other.getColor() == null : this
						.getColor().equals(other.getColor()))
				&& (this.getForecastPrice() == null ? other.getForecastPrice() == null
						: this.getForecastPrice().equals(
								other.getForecastPrice()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getOrderId() == null) ? 0 : getOrderId().hashCode());
		result = prime * result
				+ ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result
				+ ((getFettlerId() == null) ? 0 : getFettlerId().hashCode());
		result = prime * result
				+ ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
		result = prime * result
				+ ((getPayWay() == null) ? 0 : getPayWay().hashCode());
		result = prime * result
				+ ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
		result = prime
				* result
				+ ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
		result = prime * result
				+ ((getState() == null) ? 0 : getState().hashCode());
		result = prime * result
				+ ((getAssigner() == null) ? 0 : getAssigner().hashCode());
		result = prime
				* result
				+ ((getPredeterminedTime() == null) ? 0
						: getPredeterminedTime().hashCode());
		result = prime * result
				+ ((getRealBegin() == null) ? 0 : getRealBegin().hashCode());
		result = prime * result
				+ ((getRealEnd() == null) ? 0 : getRealEnd().hashCode());
		result = prime * result
				+ ((getAssignTime() == null) ? 0 : getAssignTime().hashCode());
		result = prime
				* result
				+ ((getDiagnosisResult() == null) ? 0 : getDiagnosisResult()
						.hashCode());
		result = prime
				* result
				+ ((getRealSolution() == null) ? 0 : getRealSolution()
						.hashCode());
		result = prime * result
				+ ((getAddress() == null) ? 0 : getAddress().hashCode());
		result = prime * result
				+ ((getColor() == null) ? 0 : getColor().hashCode());
		result = prime
				* result
				+ ((getForecastPrice() == null) ? 0 : getForecastPrice()
						.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", orderId=").append(orderId);
		sb.append(", userId=").append(userId);
		sb.append(", fettlerId=").append(fettlerId);
		sb.append(", orderPrice=").append(orderPrice);
		sb.append(", payWay=").append(payWay);
		sb.append(", gmtCreate=").append(gmtCreate);
		sb.append(", gmtModified=").append(gmtModified);
		sb.append(", state=").append(state);
		sb.append(", assigner=").append(assigner);
		sb.append(", predeterminedTime=").append(predeterminedTime);
		sb.append(", realBegin=").append(realBegin);
		sb.append(", realEnd=").append(realEnd);
		sb.append(", assignTime=").append(assignTime);
		sb.append(", diagnosisResult=").append(diagnosisResult);
		sb.append(", realSolution=").append(realSolution);
		sb.append(", address=").append(address);
		sb.append(", color=").append(color);
		sb.append(", forecastPrice=").append(forecastPrice);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}