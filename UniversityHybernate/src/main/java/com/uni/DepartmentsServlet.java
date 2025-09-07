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

//import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class DepartmentsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Query<Departments> q=session.createQuery("from Departments",Departments.class);
	List<Departments> dList=q.getResultList();
	
	request.setAttribute("dList", dList);
	
	RequestDispatcher rd=request.getRequestDispatcher("courses.jsp");
	rd.forward(request, response);
	
	
	session.close();
	sf.close();
	
		
		
		
	}

	

}
