package com.uni;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Directors {
	
	@Id
	private int Faculty_id;
	private String Faculty_Name;
	private float Faculty_Salary;
	private Date Joined_Date;
	private byte[] Faculty_Image;
	private int Faculty_Experience;
	private String Teacing_NonTeachingstaff;
	
	public Directors() {
		super();

	}

	public Directors(int faculty_id, String faculty_Name, float faculty_Salary, Date joined_Date, byte[] faculty_Image,
			int faculty_Experience, String teacing_NonTeachingstaff) {
		super();
		Faculty_id = faculty_id;
		Faculty_Name = faculty_Name;
		Faculty_Salary = faculty_Salary;
		Joined_Date = joined_Date;
		Faculty_Image = faculty_Image;
		Faculty_Experience = faculty_Experience;
		Teacing_NonTeachingstaff = teacing_NonTeachingstaff;
	}

	public int getFaculty_id() {
		return Faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		Faculty_id = faculty_id;
	}

	public String getFaculty_Name() {
		return Faculty_Name;
	}

	public void setFaculty_Name(String faculty_Name) {
		Faculty_Name = faculty_Name;
	}

	public float getFaculty_Salary() {
		return Faculty_Salary;
	}

	public void setFaculty_Salary(float faculty_Salary) {
		Faculty_Salary = faculty_Salary;
	}

	public Date getJoined_Date() {
		return Joined_Date;
	}

	public void setJoined_Date(Date joined_Date) {
		Joined_Date = joined_Date;
	}

	public byte[] getFaculty_Image() {
		return Faculty_Image;
	}

	public void setFaculty_Image(byte[] faculty_Image) {
		Faculty_Image = faculty_Image;
	}

	public int getFaculty_Experience() {
		return Faculty_Experience;
	}

	public void setFaculty_Experience(int faculty_Experience) {
		Faculty_Experience = faculty_Experience;
	}

	public String getTeacing_NonTeachingstaff() {
		return Teacing_NonTeachingstaff;
	}

	public void setTeacing_NonTeachingstaff(String teacing_NonTeachingstaff) {
		Teacing_NonTeachingstaff = teacing_NonTeachingstaff;
	}
	

}
