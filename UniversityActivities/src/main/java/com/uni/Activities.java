package com.uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activities {
	
	@Id
	private int activity_id;
	private String activity_Name;
	private String  Activity_Type_Sports_Clubs_Events;
	public Activities() {
		super();
	
	
	}
	
	public Activities(int activity_id, String activity_Name, String activity_Type_Sports_Clubs_Events) {
		super();
		this.activity_id = activity_id;
		this.activity_Name = activity_Name;
		Activity_Type_Sports_Clubs_Events = activity_Type_Sports_Clubs_Events;
	}
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public String getActivity_Name() {
		return activity_Name;
	}
	public void setActivity_Name(String activity_Name) {
		this.activity_Name = activity_Name;
	}
	public String getActivity_Type_Sports_Clubs_Events() {
		return Activity_Type_Sports_Clubs_Events;
	}
	public void setActivity_Type_Sports_Clubs_Events(String activity_Type_Sports_Clubs_Events) {
		Activity_Type_Sports_Clubs_Events = activity_Type_Sports_Clubs_Events;
	}
	
	
}
