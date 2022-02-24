<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.cdac.service.*,com.cdac.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>User Management Application</title>
</head>
<body>
 <center>
  <h1>User Management</h1>
        <h2>
         <a href="new">Add New User</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List All Category</a>
         
        </h2>
 </center>
    <div align="center">
       <form action="update" method="get">
       
     
 category id : <input type="text" name="id" size="45" value="<c:out value='${catobj.catid}' />" /><br>
     category name : <input type="text" name="catname" size="45" value="<c:out value='${catobj.catname}' />" />    <br> 
     <input type="submit" value="update">         
       </form>
    </div> 
</body>
</html>