package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Register {
	private String rname;
	private String remail;
	private String rmobilenum;
	@Autowired
	private Laptop laptop;

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Register() {
		super();
		System.out.println("Object Created");
	}
	
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRmobilenum() {
		return rmobilenum;
	}
	public void setRmobilenum(String rmobilenum) {
		this.rmobilenum = rmobilenum;
	}
	
	public void show() {
		System.out.println("In show");
		laptop.data();
	}
	
}
