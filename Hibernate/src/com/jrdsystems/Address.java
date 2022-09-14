package com.jrdsystems;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	@Column(name = "Addr_line_1", length = 100)
	private String Addrline1;
	@Column(name = "District", length = 50)
	private String district;
	@Column(name = "State", length = 50)
	private String state;
	@Column(name = "Pincode", length = 6)
	private int pincode;
	
	public Address() {
		super();
	}
	public Address(String addrline1, String district, String state, int pincode) {
		super();
		Addrline1 = addrline1;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public String getAddrline1() {
		return Addrline1;
	}
	public void setAddrline1(String addrline1) {
		Addrline1 = addrline1;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Addrline1=" + Addrline1 + ", district=" + district + ", state=" + state + ", pincode="
				+ pincode;
	}
	
}
