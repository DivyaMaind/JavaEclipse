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
    int id = Integer.parseInt(request.getParameter("uid"));
    //String name = request.getParameter("uname");
    //int age = Integer.parseInt(request.getParameter("uage"));
    //int salary = Integer.parseInt(request.getParameter("usalary"));
    //String desig = request.getParameter("udesig");
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Divya29");

        PreparedStatement p = con.prepareStatement("delete from employee where id = ?");

        p.setInt(1, id);

        p.execute();
        p.close();

        out.print("<h1>");
        out.print("Id:" + id + "<br>");
        out.print("</h1>");
        out.print("Deleted");
       // out.print("<a href='index.html'>HOME PAGE</a>");
    } catch(Exception e) {

        System.out.println(e);
    }    
    %>

</body>
</html>