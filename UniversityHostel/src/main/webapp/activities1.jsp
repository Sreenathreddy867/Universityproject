<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>
<%@ page import="com.uni.Activities" %> 
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Activities- SIRI Institutes</title>
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
  
  <h1 style="text-align: center; color:rgb(158, 101, 101);text-decoration:underline;font-size: 80px;;">Activities</h1>
  <main class="act-containers">
    <div class="box-container-activities">
        <h2>Activities</h2>
        <table border="1">
        	<tr style="background-color: yellow;">
      			<th>Activity_id</th>
      			<th>Activity_Name</th>
      			<th>Activity_Type_Sports_Clubs_Events</th>
        	</tr>
        	
        	<%
            List<Activities> Act = (List<Activities>) request.getAttribute("AList");
            if (Act != null) {
                for (Activities co : Act) {
            %>
                    <tr>
                        <td><%= co.getActivity_id() %></td>
                        <td><%= co.getActivity_Name() %></td>
                        <td><%= co.getActivity_Type_Sports_Clubs_Events() %></td>
                    </tr>
        <%
                }
            }
        %>
        	
        </table>
        
        
    </div>
  </main>

  <footer>
    <p>&copy; 2025 SIRI Institutes</p>
  </footer>

</body>
</html>
