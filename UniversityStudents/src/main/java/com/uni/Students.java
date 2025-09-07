package com.uni;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Students {

	@Id
	private int Student_id;
	private String  Student_Name;
	private Date Student_DateOfBirth;
	private int Student_Age;
	private String Student_Course_Enrolled;
	private float Student_Percentage;
	
	public Students() {
		super();

	
	}

	public Students(int student_id, String student_Name, Date student_DateOfBirth, int student_Age,
			String student_Course_Enrolled, float student_Percentage) {
		super();
		Student_id = student_id;
		Student_Name = student_Name;
		Student_DateOfBirth = student_DateOfBirth;
		Student_Age = student_Age;
		Student_Course_Enrolled = student_Course_Enrolled;
		Student_Percentage = student_Percentage;
	}

	public int getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public Date getStudent_DateOfBirth() {
		return Student_DateOfBirth;
	}

	public void setStudent_DateOfBirth(Date student_DateOfBirth) {
		Student_DateOfBirth = student_DateOfBirth;
	}

	public int getStudent_Age() {
		return Student_Age;
	}

	public void setStudent_Age(int student_Age) {
		Student_Age = student_Age;
	}

	public String getStudent_Course_Enrolled() {
		return Student_Course_Enrolled;
	}

	public void setStudent_Course_Enrolled(String student_Course_Enrolled) {
		Student_Course_Enrolled = student_Course_Enrolled;
	}

	public float getStudent_Percentage() {
		return Student_Percentage;
	}

	public void setStudent_Percentage(float student_Percentage) {
		Student_Percentage = student_Percentage;
	}
	
	
	
}
