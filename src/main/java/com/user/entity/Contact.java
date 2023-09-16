package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contacts_details")
public class Contact {
	
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	private long phoneNo;
	private String activesw;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getActivesw() {
		return activesw;
	}
	public void setActivesw(String activesw) {
		this.activesw = activesw;
	}
	@Override
	public String toString() {
		return "User [cid=" + cid + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", activesw="
				+ activesw + "]";
	}
	
	

}
