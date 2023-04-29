package com.example.carcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cars")
public class Car {

	@Id
	@GeneratedValue
	private int carid;
	private String manufacturer;
	private String model;
	private String yom;
	private String status;

	public int getId() {
		return carid;
	}

	public void setId(int carid) {
		this.carid = carid;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYom() {
		return yom;
	}

	public void setYom(String yom) {
		this.yom = yom;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
