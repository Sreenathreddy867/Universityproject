<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3>Add Student</h3>
		<div>
			<form action="/UniversityStudents/save">
			<label>Id:</label>
			<input type="number" name="id" placeholder="Enter your Id"><br/>
			<label>Name:</label>
			<input type="text" name="name" placeholder="Enter your Name"><br/>
			<label>Date of Birth:</label>
			<input type="date" name="dob"><br/>
			<label>Age:</label>
			<input type="number" name="age"><br/>
			<label>Select Course:</label>
			<select name=course>
				<option value="SELECT">SELECT</option>
				<option value="IT-PG">IT-PG</option>
				<option value="CSE-UG">CSE-UG</option>
				<option value="CSM-UG">CSM-UG</option>
				<option value="CSE-PG">CSE-PG</option>
				<option value="CSD-UG">CSD-UG</option>
			</select><br/>
			<label>Percentage:</label>
			<input type="number" name="percentage"><br/>
			<input type="submit">
			</form>
		</div>
</body>
</html>