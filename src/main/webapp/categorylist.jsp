<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <center>
  <h1>Category Management</h1>
        <h2>
         <a href="new">Add New Category</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List All Category</a>
         
        </h2>
 </center>
<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Categories</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="catlist" items="${catlist}">
                <tr>
                    <td><c:out value="${catlist.catid}" /></td>
                    <td><c:out value="${catlist.catname}" /></td>
                    <td>
                     <a href="edit?id=<c:out value='${catlist.catid}' />">Edit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?id=<c:out value='${catlist.catid}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 
</body>
</html>