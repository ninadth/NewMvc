package com.BikkadIT.SendingDataUIToController.model;

public class User {

	private String fname;
	private String lname;
	private String Email;
	private String address;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", Email=" + Email + ", address=" + address + "]";
	}
	
	
}
