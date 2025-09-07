package com.uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hostels {
	@Id
	private int Hostel_id;
	private String Hostels_type;
	private int Beds_Type;
	private float Hostel_price;
	public Hostels() {
		super();

	}
	public Hostels(int hostel_id, String hostels_type, int beds_Type, float hostel_price) {
		super();
		Hostel_id = hostel_id;
		Hostels_type = hostels_type;
		Beds_Type = beds_Type;
		Hostel_price = hostel_price;
	}
	public int getHostel_id() {
		return Hostel_id;
	}
	public void setHostel_id(int hostel_id) {
		Hostel_id = hostel_id;
	}
	public String getHostels_type() {
		return Hostels_type;
	}
	public void setHostels_type(String hostels_type) {
		Hostels_type = hostels_type;
	}
	public int getBeds_Type() {
		return Beds_Type;
	}
	public void setBeds_Type(int beds_Type) {
		Beds_Type = beds_Type;
	}
	public float getHostel_price() {
		return Hostel_price;
	}
	public void setHostel_price(float hostel_price) {
		Hostel_price = hostel_price;
	}
	
	
	
	

}
