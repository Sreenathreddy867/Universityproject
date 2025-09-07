<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.uni.Students" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Students - SIRI Institutes</title>
  <link rel="stylesheet" href="hostels.css">
</head>
<body>

  <header>
    <img  src="siri institutions image.png" alt="Siri Institutes" style="float: left;" height="140px" width="160px">
     <img  src="siri institutions image.png" alt="Siri Institutes" style="float: right ;" height="140px" width="160px">
    <h1 style="font-weight:1000; color: black; font-stretch: expanded ;">SIRI INSTITUTES</h1>
    <p>Shaping the Future</p>
    
  </header>

  <nav>
      <a href="index.html" target="_blank">Home</a>
    <a href="admissions1.html" target="_blank">Admissions</a>
    <a href="http://localhost:8081/UniversityHybernate/departments" target="_blank">Courses</a>
    <a href="http://localhost:8081/UniversityActivities/ActivitiesServlet" target="_blank">Activities</a>
    <a href="gallery1.html" target="_blank">Gallery</a>
    <a href="http://localhost:8081/UniversityDirectors/directors" target="_blank">Directors</a>
    <a href="http://localhost:8081/UniversityStudents/students" target="_blank">Students</a>
      <a href="http://localhost:8081/UniversityHostel/hostels" target="_blank">Hostels</a>
    <a href="contact.html" target="_blank">Contact</a>
  </nav>

  <main>
    <h1 style="text-align: center; color:rgb(200, 57, 219);text-decoration: underline;font-size: 80px;;">STUDENTS</h1>
    <div  class="act-containers">
    <div class="box-container-directors">
		 <h3>Students</h3>
        <table border="1" style="text-align: center;">
        	<tr style="background-color: pink;">
      			<th>Student_id</th>
      			<th>Student_Name</th>
      			<th>Student_DateOfBirth</th>
      			<th>Student_Age</th>
      			<th>Student_Course_Enrolled</th>
      			<th> Student_Percentage</th>
      			
        	</tr>
        	
        	
     	<%
            List<Students> list = (List<Students>) request.getAttribute("sList");
            if (list != null) {
                for (Students co : list) {
        %>
                    <tr>
                        <td><%= co.getStudent_id() %></td>
                        <td><%= co.getStudent_Name() %></td>
                        <td><%= co.getStudent_DateOfBirth() %></td>
                        <td><%= co.getStudent_Age() %></td>
                        <td><%= co.getStudent_Course_Enrolled() %></td>
                        <td><%= co.getStudent_Percentage() %></td>
                    </tr>
        <%
                }
            }
        %>
        	
        	
        </table>
        
    </div>
    
      
    </div>
  </main>

  <footer>
    <p>&copy; 2025 SIRI Institutes</p>
  </footer>

</body>
</html>
    