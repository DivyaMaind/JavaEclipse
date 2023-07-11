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
try {
	ServletContext context=getServletContext();
    String driver=context.getInitParameter("driver");
    String url=context.getInitParameter("url");
    String username=context.getInitParameter("username");
    String password=context.getInitParameter("password");

   Class.forName(driver);
   Connection con= DriverManager.getConnection(url,username,password);
   java.sql.Statement stmt=con.createStatement();
	ResultSet r = stmt.executeQuery("select * from account");
	
	out.print("<h4>");
	out.print(" id : name : acoount number : ifsc code : pan card : phone number : address : balance <br>");
	
	while(r.next()) {
		
		out.print(r.getInt(1) + "   " + r.getString(2) + "   " + r.getString(3) + "   " + r.getString(4) + "   " + r.getString(5) + "   " + r.getString(6) + "   " + r.getString(7) + "   " + r.getInt(8));
		out.print("<br>");
	}
	
	out.print("</h4>");

	out.print("<a href='Index.html'>Home page</a>");
} catch(Exception e) {
	
	System.out.println(e);
}


%>

</body>
</html>