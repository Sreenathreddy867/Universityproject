<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red; ">Add Activity</h1>
	<div>
	<form action="/UniversityActivities/Save">
		<label>Activity Id:</label>
		<input type="number" name="id" placeholder="Enter  Id"><br/>
		<label>Activity Name:</label>
		<input type="text" name="name" placeholder="Enter name"><br/>
		<label>Select Activity Type:</label>
		<select name="event"> 
			<option value="Select">SELECT</option>
			<option value="SPORTS">SPORTS</option>
			<option value="CLUBS">CLUBS</option>
			<option value="EVENTS">EVENTS</option>
		</select><br/>
		<input type="submit">
		
	</form>
	</div>
</body>
</html>