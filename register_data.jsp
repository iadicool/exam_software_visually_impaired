<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.Vector" %>
<%@ page import="java.sql.*" %>    
<%String query=""; %>    
<!DOCTYPE html>
<html>
    <head>
        <title>Preview</title>
       	 <style type="text/css">
            #can{
                margin-right:-800px;
                width: 150px;
                height: 150px;
                border: 2px solid black;
            }
            </style>
    </head>
    <body>
    <%
       String id=session.getAttribute("userid").toString();
       String fname1=request.getParameter("fname");
       String lname1=request.getParameter("lname");
       String faname1=request.getParameter("faname");
       String mname1=request.getParameter("mname");
       String category1=request.getParameter("category");
       String password1=request.getParameter("pswd");
       String phoneno1=request.getParameter("phone");
       String dob1=request.getParameter("date1");
       String gender1=request.getParameter("gen");
       String address11=request.getParameter("address1");
       String address21=request.getParameter("address2");
       String address31=request.getParameter("address3");
       String state1=request.getParameter("state");
       String city1=request.getParameter("cityname");
       String pincode1=request.getParameter("pincode");
       int phoneno2=Integer.parseInt(phoneno1);
       java.sql.Date sqlDate=java.sql.Date.valueOf(dob1);
       int pincode2=Integer.parseInt(pincode1);
       System.out.println("Id received is "+id);
          %>        
<%Connection con=null;
String url="jdbc:mysql://localhost:3306/examination";
String uname1="root";
String pass="";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url,uname1,pass);
}catch(Exception e)
{
	e.printStackTrace();
}
query="insert into register values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
try
{
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, id);
	ps.setString(2, fname1);
	ps.setString(3, lname1);
	ps.setString(4, faname1);
	ps.setString(5, mname1);
	ps.setString(6, category1);
	ps.setString(7, password1);
	ps.setInt(8, phoneno2);
	ps.setDate(9, sqlDate);
	ps.setString(10, gender1);
	ps.setString(11, address11);
	ps.setString(12, address21);
	ps.setString(13, address31);
	ps.setString(14, state1);
	ps.setString(15, city1); 
	ps.setInt(16, pincode2);
	int i=ps.executeUpdate();
}catch(Exception ex)
{
	ex.printStackTrace();
}
%>            
        <table><tr>
<td style="border-bottom: 1px solid gray; width: 47%">&nbsp;</td>
<td style="vertical-align:middle;text-align:center" rowspan="2">Personal Details</td>
<td style="border-bottom: 1px solid gray; width: 47%">&nbsp;</td>
</tr><tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr></table>
 <p>
        <canvas id="can" name="canv">   
        </canvas>
        </p>
       
        <p><b>Name:&nbsp;</b><%=fname1%>&nbsp;<%=lname1%></p> 
        <p><b>Father's Name&nbsp;</b><%= faname1%></p>
        <p><b>Mother's Name:&nbsp;</b><%=mname1%></p>
        <p><b>User ID:&nbsp;</b><%="Cool"%></p>
        <p><b>Phone no.&nbsp;</b><%= phoneno1%></p>
        <p><b>DOB:&nbsp;</b><%= dob1%></p>
        <p><b>Gender:&nbsp;</b><%= gender1%></p>
        
        <script>
            function upload()
            {
                var imgcanvas=document.getElementById("can");
                var fileinput=document.getElementById("finput");
                var image=new SimpleImage(${imagePath});
                image.drawTo(imgcanvas);
                
            }
            }
            
        </script>
        <script src="http://www.dukelearntoprogram.com/course1/common/js/image/SimpleImage.js">   
        </script>
        
       
        
        <table><tr>
<td style="border-bottom: 1px solid gray; width: 47%">&nbsp;</td>
<td style="vertical-align:middle;text-align:center" rowspan="2">Address Details</td>
<td style="border-bottom: 1px solid gray; width: 47%">&nbsp;</td>
</tr><tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr></table>
<p><b>Address:&nbsp;</b><%=address11 %>&nbsp;<%=address21 %>&nbsp;<%=address31 %></p>
<p><b>Pin:&nbsp;</b><%=pincode1 %></p>
        
    </body>
    
    
    
</html>
