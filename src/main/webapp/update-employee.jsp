<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<link rel="stylesheet",href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
	<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
</head>
<body>
<div class="container">
	<a href="index.jsp"><button type="button" class="btn btn-info">Home</button></a>
	<br> <br>
	<form  action="update" method="post">
	  <div class="form-group">
	  <input type="hidden" class="form-control"  name="empid" value ="${toBeEdited.id}" >
	    <label for="name">Name</label>
	    <input type="text" class="form-control"  name="name" value ="${toBeEdited.name}" >
	  </div>
	  <div class="form-group">
	    <label for="email">Email</label>
	    <input type="email" class="form-control"  name="email" value ="${toBeEdited.email}">
	  </div>
	   <div class="form-group">
	    <label for="gender">gender</label>
	    <input type="text" class="form-control"  name="gender" value ="${toBeEdited.gender}">
	  </div>
	  <div class="form-group">
	    <label for="address">Address</label>
	    <input type="text" class="form-control"  name="address" value ="${toBeEdited.address}" >
	  </div>
	  <button type="submit" class="btn btn-outline-success">Save</button>
	</form>

</div>


</body>
</html>