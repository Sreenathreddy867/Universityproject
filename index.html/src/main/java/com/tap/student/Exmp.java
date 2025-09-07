package com.tap.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Exmp extends HttpServlet {
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	
	String url="jdbc:mysql://localhost:3306/tapacademy";
	String un="root";
	String pwd="root"; 
	
	@Override
	public void init() throws ServletException {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url, un, pwd); 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String userName=req.getParameter("id");
		//String password=req.getParameter("p");
		
//		
//		String username=req.getParameter("username");
//		String password=req.getParameter("password");
		
		try {
			String query="select * from tapstudent where id=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, userName);
			//pstmt.setString(2, password);
			res=pstmt.executeQuery();
			
//			while(res.next()) {
//				pw.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getString(4)+" "+res.getString(5));
//				pw.println();
//			}
			
			if (res.next()) {
				
				pw.println("<h3>Welcome "+res.getString(2) +"!</h3>");
				
			} 
			else {
				pw.println("<h3>Invalid login details please try again!...</h3>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
		
	}
	
	@Override
	public void destroy() {
		
		try {
			pstmt.close();
			res.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}














