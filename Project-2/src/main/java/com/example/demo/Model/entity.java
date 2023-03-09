 package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Essar")
public class entity {
	@Id
	private int id;
	private String passengername;
	private int classtype;
	private int ph ;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassengerName() {
		return passengername;
	}
	public void setPassengerName(String passengerName) {
		this.passengername = passengerName;
	}
	public int getClasstype() {
		return classtype;
	}
	public void setClasstype(int classtype) {
		this.classtype = classtype;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
 }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public entity(int id, String passengerName, int classtype, int ph, int age) {
		super();
		this.id = id;
		this.passengername = passengerName;
		this.classtype = classtype;
		this.ph = ph;
		this.age = age;
	}
public entity()
{
	
}
}