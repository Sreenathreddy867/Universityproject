package com.uni;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uni.Activities;
public class SaveActivity extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int activity_id=Integer.parseInt(request.getParameter("id"));
		String activty_Name=request.getParameter("name");
		String Activity_Type_Sports_Clubs_Events=request.getParameter("event");
		
		Activities a=new Activities();
		a.setActivity_id(activity_id);
		a.setActivity_Name(activty_Name);
		a.setActivity_Type_Sports_Clubs_Events(Activity_Type_Sports_Clubs_Events);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		session.close();
		
		response.sendRedirect("http://localhost:8081/UniversityActivities/ActivitiesServlet");
	}

}
