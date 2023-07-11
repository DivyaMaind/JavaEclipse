<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    int id = Integer.parseInt(request.getParameter("uid"));
    String name = request.getParameter("uname");
    int age = Integer.parseInt(request.getParameter("uage"));
    int salary = Integer.parseInt(request.getParameter("usalary"));
    String desig = request.getParameter("udesig");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

        PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
        p.setInt(1, id);
        p.setString(2, name);
        p.setInt(3, age);
        p.setInt(4, salary);
        p.setString(5, desig);

        p.execute();
        p.close();

        out.print("<h1>");
        out.print("Inserted");
        out.print("</h1>");
    } catch(Exception e) {

        System.out.println(e);
    }    
    %>
</body>
</html>