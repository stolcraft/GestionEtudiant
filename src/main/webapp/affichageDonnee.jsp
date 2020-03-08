<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="css/style.css" %>
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>AUTHENTIFICATION</title>
</head>
<body>
	<h1 class="display-4">AUTHENTIFICATION</h1>

	<!-- On intègre un formulaire à la page HTML -->	
	
	<form id="test" action="login" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Login</label>
    <input class="form-control" id="Login" aria-describedby="emailHelp" name="loginuser">
    <small id="Login" class="form-text text-muted" >We'll never share your login with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="Password" name="mdpuser">
  </div>
  <button type="submit" class="btn btn-primary">Envoyer</button>
</form>
</body>
</html>