package com.aaa.entity;

public class Order_Fault {
	
	private int faultId;
	private int orderId;
	public int getFaultId() {
		return faultId;
	}
	public void setFaultId(int faultId) {
		this.faultId = faultId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "Order_Fault [faultId=" + faultId + ", orderId=" + orderId + "]";
	}
	
	

}
