<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.uni.Departments" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Courses - SIRI Institutes</title>
  <link rel="stylesheet" href="directors.css">
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
    <h1 style="text-align: center; color:rgb(200, 57, 219);text-decoration: underline;font-size: 80px;;">Courses</h1>
    <div  class="act-containers">
    <div class="box-container-courses">
        <h3 style="color: #ff8c00;">UG Courses:</h3>
        <p>Engineering & Technology (B.Tech / B.E)</p>
        <table border="1" style="text-align: center;">
        	<tr style="background-color: yellow;">
      			<th>Course Number</th>
      			<th>Course Name</th>
        	</tr>
        	
        	
     	<%
            List<Departments> list = (List<Departments>) request.getAttribute("dList");
            if (list != null) {
                for (Departments co : list) {
        %>
                    <tr>
                        <td><%= co.getDep_id() %></td>
                        <td><%= co.getDep_name() %></td>
                    </tr>
        <%
                }
            }
        %>
        	
        	
        </table>
        
    </div>
    <div class="box-container-courses">
        <h3 style="color: #ff8c00;">PG Courses</h3>
        <p>Engineering & Technology (M.Tech / M.E)</p>
         <table border="1" style="text-align: center;">
        	<tr style="background-color: yellow;">
      			<th>Course Number</th>
      			<th>Course Name</th>
        	</tr>
        	
        	
     	<%
            List<Departments> list2 = (List<Departments>) request.getAttribute("dList");
            if (list2 != null) {
                for (Departments co : list2) {
        %>
                    <tr>
                        <td><%= co.getDep_id() %></td>
                        <td><%= co.getDep_name() %></td>
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
    