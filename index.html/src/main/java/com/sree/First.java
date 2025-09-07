package com.sree;

//import java.awt.PageAttributes.PrintQualityType;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Enumeration;

import javax.servlet.RequestDispatcher;

//import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

//@WebServlet("/First")
public class First extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	

//		String name=req.getParameter("name");
//		String desig=req.getParameter("desig");
//		String ts=req.getParameter("techskills");
//		
//		System.out.println("Name:"+name);
//		System.out.println("Designation:"+desig);
//		System.out.println("TechSkills:"+ts);
	
	
//	Enumeration<String> pN=req.getParameterNames();
//	while(pN.hasMoreElements()) {
//		System.out.println(pN.nextElement());
//	}
		
		 String name=req.getParameter("name");
		 String desig=req.getParameter("desig");
		 String[] pV=req.getParameterValues("techskills");
		 
//		 PrintWriter pw=resp.getWriter();
//		 pw.println("name="+name);
//		 pw.println("designation="+desig);
//		 for(String i:pV) {
//			 pw.println("techskills:"+i);
//		 }
		 
		 
//		 
		 System.out.println("name= "+name);
		 System.out.println("designation= "+desig);
		 for(String i:pV) {
			 System.out.println(i);
		 }
		 
		 
		 RequestDispatcher rd=req.getRequestDispatcher("staticresp.html");
		 rd.forward(req, resp);
		 
//		 resp.setContentType("text/html");
//		 PrintWriter pw=resp.getWriter();
//		 pw.println("<html>\r\n"
//		 		+ "<head>\r\n"
//		 		+ "<meta charset=\"UTF-8\">\r\n"
//		 		+ "<title>Insert title here</title>\r\n"
//		 		+ "</head>\r\n"
//		 		+ "<body>\r\n"
//		 		+ "	<h2 style=\"color: orange;\">Thank you for the Response.."+name+"</h2>\r\n"
//		 		+ "</body>\r\n"
//		 		+ "</html>");
//		 
	}
	

}
