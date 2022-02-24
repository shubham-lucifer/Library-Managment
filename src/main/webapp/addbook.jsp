<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="get"> 
ISBN:<input type="number" name="isbn"><br><br>
Book_Title:<input type="text" name="bname"><br><br> 
Publication_year:<input type="text" name="pubname"><br><br>
Language:<input type="text" name="lang"><br><br>
Category_Type:<input type="text" name="cattype"><br><br>
No_Of_Copies_Actual:<input type="number" name="actualcopy"><br><br>
No_Of_Copies_Current:<input type="number" name="currentcopy"><br><br>

<input type="submit" value="Add"> 
</form>
</body>
</html>