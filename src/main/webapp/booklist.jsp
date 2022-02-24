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
  <h1>Book Management</h1>
        <h2>
         <a href="new">Add New Book</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List All Books</a>
         
        </h2>
 </center>
<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>ISBN</th>
                <th>Book_Title</th>
                <th>Publication_year</th>
                <th>Language</th>
                <th>Category_Type</th>
                <th>No_Of_Copies_Actual</th>
                <th>No_Of_Copies_Current</th>
            </tr>
           
        </table>
    </div> 
</body>
</html>