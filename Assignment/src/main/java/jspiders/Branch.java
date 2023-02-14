package jspiders;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	
	private int id;
	private String Bname;
	@Id
	private int pincode;
	@OneToMany
	private List<Admission> admissions;
	
	@OneToMany
	private List<Cource> cources1;
	
	@OneToMany
	private List<Trainer> trainers;
	
	
	
	
	
	
	public List<Cource> getCources() {
		return cources1;
	}
	public void setCources(List<Cource> cources) {
		this.cources1 = cources;
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	public List<Admission> getAdmission() {
		return admissions;
	}
	public void setAdmission(List<Admission> admission) {
		this.admissions = admission;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
