<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<%@ page import="eu.ensup.demoJpa.domaine.*"%>
<%@ page import="eu.ensup.demoJpa.service.*"%>
<%
Integer id=(Integer)request.getAttribute("id");
%>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div class="jumbotron">
	  <h1>Modifier un étudiant</h1>
	</div>
	<div class="container">
        <div class="card card-container">
            <p id="profile-name" class="profile-name-card">Formulaire de modification d'étudiant</p>
            
            <form class="form-signin" action="modifierEtu" method="post">
                <span id="reauth-email" class="reauth-email"></span>
                <input name="id" type="number" id="inputEmail" class="form-control" placeholder=<%=id %> value=<%=id%> readonly>
                <input name="nom" type="text" id="inputEmail" class="form-control" placeholder="Nom" required autofocus>
                <input name="prenom" type="text" id="inputEmail" class="form-control" placeholder="Prenom" required autofocus>
                <input name="mail" type="text" id="inputEmail" class="form-control" placeholder="Mail" required autofocus>
                <input name="adresse" type="text" id="inputEmail" class="form-control" placeholder="Adresse" required autofocus>
                <input name="telephone" type="number" id="inputEmail" class="form-control" placeholder="Téléphone" required autofocus>
                <input name="dateNaissance" type="text" id="inputEmail" class="form-control" placeholder="Date de Naissance" required autofocus>                
                
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Ajouter l'étudiant</button>
            </form><!-- /form -->
        
        </div><!-- /card-container -->
    </div><!-- /container -->
	

</body>
</html>