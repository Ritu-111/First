package jspiders;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cource {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Id
	private String Cname;
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	private double fees;
	
	

}
