package com.form.db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id ;
private int rollno;
private String name;
private String lastname;
private String schoolfee;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getSchoolfee() {
	return schoolfee;
}
public void setSchoolfee(String schoolfee) {
	this.schoolfee = schoolfee;
}
@Override
public String toString() {
	return "FormEntity [id=" + id + ", rollno=" + rollno + ", name=" + name + ", lastname=" + lastname + ", schoolfee="
			+ schoolfee + "]";
}
public FormEntity(int id, int rollno, String name, String lastname, String schoolfee) {
	super();
	this.id = id;
	this.rollno = rollno;
	this.name = name;
	this.lastname = lastname;
	this.schoolfee = schoolfee;
}
public FormEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
