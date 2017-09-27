package com.org.HibaernateOneToOne;

import javax.persistence.Embeddable;

@Embeddable
public class StudentInfo {
	private String FName;
	private String MName;
	private String LName;
	public String getFName() {
		return FName;
	}
	public void setFName(String FName) {
		this.FName = FName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String MName) {
		this.MName = MName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String LName) {
		this.LName = LName;
	}
	
	
	
	

}
