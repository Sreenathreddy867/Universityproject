<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.uni.Hostels" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Hostels - SIRI Institutes</title>
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
    <h1 style="text-align: center; color:rgb(200, 57, 219);text-decoration: underline;font-size: 80px;;">HOSTELS</h1>
    <div  class="act-containers">
    <div class="box-container-hostel">
		 <h3>Hostel Deatils</h3>
        <table border="1" style="text-align: center; " >
        	<tr style="background-color: pink;">
      			<th>Hostel_id</th>
      			<th>Hostels_type</th>
      			<th>Beds_Type</th>
      			<th>Hostel_price</th>
        	</tr>
        	
        	
     	<%
            List<Hostels> list = (List<Hostels>) request.getAttribute("hList");
            if (list != null) {
                for (Hostels co : list) {
        %>
                    <tr>
                        <td><%= co.getHostel_id() %></td>
                        <td><%= co.getHostels_type() %></td>
                        <td><%= co.getBeds_Type() %></td>
                        <td><%= co.getHostel_price() %></td>
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
    