package com.uni;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveRecord extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int Student_id=Integer.parseInt(request.getParameter("id"));
		String Student_Name=request.getParameter("name");
		Date Student_DateOfBirth=Date.valueOf(request.getParameter("dob"));
		int Student_Age=Integer.parseInt(request.getParameter("age"));
		String Student_Course_Enrolled=request.getParameter("course");
		float Student_Percentage=Float.parseFloat(request.getParameter("percentage"));
		
		Students s=new Students();
		s.setStudent_id(Student_id);
		s.setStudent_Name(Student_Name);
		s.setStudent_DateOfBirth(Student_DateOfBirth);
		s.setStudent_Age(Student_Age);
		s.setStudent_Course_Enrolled(Student_Course_Enrolled);
		s.setStudent_Percentage(Student_Percentage);
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		
		response.sendRedirect("http://localhost:8081/UniversityStudents/students");
		
	}

	

}
