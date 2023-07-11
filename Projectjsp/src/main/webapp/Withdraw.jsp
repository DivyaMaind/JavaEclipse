<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Application</title>
<style type="text/css">
 body {
            background-color: #f2f2f2;
            font-family: Arial, sans-serif;
        }
       
        
        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
       
        </style>
</head>
<body>
<%

int id = Integer.parseInt(request.getParameter("id"));

int amt = Integer.parseInt(request.getParameter("amt"));

try {
	
	 ServletContext context=getServletContext();
     String driver=context.getInitParameter("driver");
     String url=context.getInitParameter("url");
     String username=context.getInitParameter("username");
     String password=context.getInitParameter("password");

    Class.forName(driver);
    Connection con= DriverManager.getConnection(url,username,password);
    java.sql.Statement stmt=con.createStatement();
	
	PreparedStatement p = con.prepareStatement("update account set inb = inb-? where id = ?");
	
	p.setInt(1, amt);
	p.setInt(2, id);
	
	p.execute();
	p.close();
	
	out.print("<h1>");
	out.print("Withdraw Amount: " + amt + "<br>");

	out.print("<a href='Index.html'>Home page</a>");
	
} catch(Exception e) {
	
	System.out.println(e);
}
%>
</body>
</html>