package com.org.HibaernateOneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int Lid;
	private String LpName;
	
	
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLpName() {
		return LpName;
	}
	public void setLpName(String lpName) {
		LpName = lpName;
	}
	
	

}
