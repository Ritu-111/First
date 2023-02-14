package jspiders;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int yop;
	@ManyToMany
	private List <Cource> cources;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public List<Cource> getCources() {
		return cources;
	}
	public void setCources(List<Cource> cources) {
		this.cources = cources;
	}

}
