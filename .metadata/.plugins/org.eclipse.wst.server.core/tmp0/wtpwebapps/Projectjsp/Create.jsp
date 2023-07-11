<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Bank Application</title>
</head>
<body>

<%
//int id = Integer.parseInt(request.getParameter("id"));
String id = request.getParameter("id");
String name = request.getParameter("name");

String acc = request.getParameter("acc");
String ifsc = request.getParameter("ifsc");
String pan = request.getParameter("pan");

String phn = request.getParameter("phn");
String adr = request.getParameter("adr");
//int inb = Integer.parseInt(request.getParameter("inb"));
String inb = request.getParameter("inb");
try {
	
	ServletContext context=getServletContext();
    String driver=context.getInitParameter("driver");
    String url=context.getInitParameter("url");
    String username=context.getInitParameter("username");
    String password=context.getInitParameter("password");

   Class.forName(driver);
   Connection con= DriverManager.getConnection(url,username,password);
   java.sql.Statement stmt=con.createStatement();
	
	PreparedStatement p = con.prepareStatement("insert into account values(?, ?, ?, ?, ?, ?, ?, ?)");
	
	//p.setInt(1, id);
	p.setString(1, id);
	p.setString(2, name);
	p.setString(3, acc);
	p.setString(4, ifsc);
	p.setString(5, pan);
	p.setString(6, phn);
	p.setString(7, adr);
	p.setString(8, inb);
	//p.setInt(8, inb);
	
	p.execute();
	p.close();
	
	out.print("<h1>");
	out.print("Id: " + id + "<br>");
	out.print("Name: " + name + "<br>");
	out.print("Account No: " + acc + "<br>");
	out.print("IFSC: " + ifsc + "<br>");
	out.print("PAN: " + pan + "<br>");
	out.print("Phone No: " + phn + "<br>");
	out.print("Aadhar: " + adr + "<br>");
	out.print("Initial Balance: " + inb + "<br>");
	

	out.print("<a href='Index.html'>Home page</a>");
	 //response.sendRedirect("Index.html");
} catch(Exception e) {
	
	System.out.println(e);
}
	%>

</body>
</html>