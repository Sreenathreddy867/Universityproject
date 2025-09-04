package com.uni;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ActivitiesServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Query<Activities> q=session.createQuery("from Activities",Activities.class);
		List<Activities> AList=q.getResultList();
		
		request.setAttribute("AList", AList);
		
		RequestDispatcher rd=request.getRequestDispatcher("activities1.jsp");
		rd.forward(request, response);
		
		
		session.close();
		sf.close();
		
			
	
	}

}
