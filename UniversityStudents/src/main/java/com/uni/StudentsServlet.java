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
public class StudentsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Query<Students> q=session.createQuery("from Students",Students.class);
		List<Students> sList=q.getResultList();
		
		request.setAttribute("sList", sList);
		
		RequestDispatcher rd=request.getRequestDispatcher("students.jsp");
		rd.forward(request, response);
	

	
	}


}
