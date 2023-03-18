package com.springframework.database.databasedemo.entity;

public class Person {
	private int id;
	private String name;
	private String location;
	
	public Person() {
		
	}
	public Person(int id, String name, String location) {
		super();
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.location= location;
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
