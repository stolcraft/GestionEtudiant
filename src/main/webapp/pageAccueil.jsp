<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<%@ page import="eu.ensup.demoJpa.domaine.*"%>
<%@ page import="eu.ensup.demoJpa.service.*"%>
<%
GestionEcoleService ges = new GestionEcoleService();
ArrayList<Etudiant> maListeEtudiant = ges.listerEtudiants();
%>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1 class="display-4">Bienvenue sur le tableau de bord</h1>
	
	
<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Date de Naissance</th>
      <th scope="col">EMAIL</th>
      <th scope="col">Modification</th>
      <th scope="col">Suppression</th>
     
    </tr>
  </thead>
  <tbody>
  <%
		for ( int i=0; i<maListeEtudiant.size(); i++ )
		{
%>
    <tr>
      <th scope="row"><% out.println(i); %></th>
      <td><% out.println(maListeEtudiant.get(i).getNom()); %></td>
      <td><% out.println(maListeEtudiant.get(i).getPrenom()); %></td>
      <td><% out.println(maListeEtudiant.get(i).getDateNaiss()); %></td>
      <td><% out.println(maListeEtudiant.get(i).getMail()); %></td>
      <td><a href="/DemoJpaServlet/modification?id=<%=maListeEtudiant.get(i).getId()%>" name="id" id="id">Modification </a></td>
      <td><a href="/DemoJpaServlet/supression?id=<%=maListeEtudiant.get(i).getId()%>" name="id" id="id">Suppression </a></td>
    </tr>
    <% } %>
  </table>
  
  <form id="test" action="ajouter" method="post">
				<button type="submit"  class="btn btn-primary btn-lg">Ajouter Etudiant
			
				</button>
			</form>
	
</body>
</html>