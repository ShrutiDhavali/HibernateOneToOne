package com.org.HibaernateOneToOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int sId;
	private StudentInfo sName;
	@OneToOne
	private Laptop laptop;
	
		
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	 
	public StudentInfo getsName() {
		return sName;
	}
	public void setsName(StudentInfo sName) {
		this.sName = sName;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
	
	
	
	

}
