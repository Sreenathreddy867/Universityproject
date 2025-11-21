<%@ page import="com.uni.Students" %>
<%
    Students s = (Students) request.getAttribute("student");
%>

<h2 align="center">Edit Student Details</h2>

<form action="/UniversityStudents/save" method="get" style="text-align: center;">
    <input type="hidden" name="id" value="<%= s.getStudent_id() %>">

    Name: <input type="text" name="name" value="<%= s.getStudent_Name() %>"><br><br>
    DOB: <input type="date" name="dob" value="<%= s.getStudent_DateOfBirth() %>"><br><br>
    Age: <input type="number" name="age" value="<%= s.getStudent_Age() %>"><br><br>
    Course: <input type="text" name="course" value="<%= s.getStudent_Course_Enrolled() %>"><br><br>
    Percentage: <input type="number" step="0.1" name="percentage" value="<%= s.getStudent_Percentage() %>"><br><br>

    <input type="submit" value="Update Student">
    &nbsp;&nbsp;
    <!-- Cancel button -->
    <button type="button" onclick="window.location.href='/UniversityStudents/students';">Cancel</button>
    &nbsp;&nbsp;
    <!-- Delete button -->
    <button type="button" onclick="confirmDelete(<%= s.getStudent_id() %>);">Delete</button>
</form>

<script>
    function confirmDelete(id) {
        if (confirm("Are you sure you want to delete this student?")) {
            window.location.href = "StudentsServlet?action=delete&student_id=" + id;
        }
    }
</script>
