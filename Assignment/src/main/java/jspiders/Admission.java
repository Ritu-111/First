package jspiders;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class Admission {
	@Id
	private int id;
	private int regNo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	

	@OneToOne
	private  Student s;

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}
	
	
	

}
