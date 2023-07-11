<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

    Statement s = con.createStatement();
    ResultSet r = s.executeQuery("select * from employee");

    out.print("<h4>");

    while(r.next()) {
        out.println(r.getInt(1) + ":" + r.getString(2) + ":" + r.getInt(3) + ":" + r.getInt(4) + ":" + r.getString(5) + ":");
        out.print("<br>");
    }

    out.print("/<h4>");
    out.print("<a href='Entry.html'>HOME PAGE</a>");

} catch(Exception e) {

    System.out.println(e);
}    
%>
</body>
</html>