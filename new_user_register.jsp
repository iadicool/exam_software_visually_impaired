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
<%@page import="java.util.Random"%>   
<%String query=""; %>
<%String id=""; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <script src="validating.js"> </script>
<head>
<style type="text/css"> 
            body{
                 
                font-size: 20px;
            }
            h1{
                margin: 2px;
                margin-left: 18%;
                font-size: 40px;
                margin-top: 0px;
            }
            #first{
                color: white;
                background-color: #051328;
                font-size: 18px;
                margin-left:-8px;
                margin-top: -8px;
                margin-right: -8px;
            }
            #second{
                color: white;
                margin-left: 260px;
                font-size: 15px;
                text-decoration: none;
                padding-top: -5px;
            }
            #third{
                
                color: white;
            }
            #hexcode{
                
                font-size: 20px;
            }
            #vertcol
            {
                font-size: 17px;
                line-height: 50px;
                background-color:white;
                float:left;
                margin-top: -216px;  
                padding-top: 45px;
                text-align:left;
                padding-left: 25px;
                width   : 180px;
                height: 654px;
                margin-left: -8px;
                font-family: Georgia;
            }
            #log
            {
                color: white;
                text-decoration:none;
            }
            #vertcol a:hover{
                color:red;
            } 
           
           .mark1{
                background-color:#232425; 
               color:white;
            }
            
           input {
                border: 2px solid #232425;
                border-radius: 4px;
            }
            #logo{
                margin-left: 43%;
                margin-top: 5px;
                font-size: 28px;
            }
            #login{
                font-size: 20px;   
            }
            #login #login_1{
                margin-left: 16%;
                font-size: 28px;
            }
            #login #login_2{
                margin-left: 16%;
                font-size: 24px;
                margin: 5px;
            }#login #login_3{
                margin-left: 16%;
                font-size: 24px;
                margin: 5px;
            }
            #login #login_4{
                margin-left: 16%;
                font-size: 24px;
                margin: 5px;
                color: #000099;
                font-weight: 500;
                line-height:0.5em;
            }
            #login #login_5{
                margin-left: 16%;
                font-size: 24px;
                margin: 5px;
            }
             #login #login_6{
                margin-left: 16%;
                font-size: 24px;
                margin: 2px;
            }
            input{
                line-height: 2em;
                margin-left: 0.8%;
                background-color: #FFFFcc;
                font-size: 14px;
            }
            #captcha_1{
                line-height: 1.2em;
                margin-left: 0.8%;
                background-color: white;
                border-color:black;
                background-color:#CCE5FF;
                font-weight: bold;
            }
            #captcha_2{
                line-height: 1.2em;
                margin-left: 0.8%;
                background-color: white;
                border-color: black;
            }
            #button_1 {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 8px 16px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 15px;
                margin-left: 0.8%;
            }
             #button_2{
                background-color: #3399ff;
                border: none;
                color: white;
                padding: 12px 60px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 15px;
                margin-left: 20%;
            }
            #bordr{
                border:4px solid #051328;
                border-style:solid;
                background:linear-gradient(to right,antiquewhite,white);
            }   
            #sel{
                border-width: 2px;
                border-color: black;
                border-style:solid;
            }
            #sel1{
                border-width: 2px;
                border-color: black;
                border-style:solid;
            }
             #copyr{
                font-size: 12px;
                background-color:#e0e0e0;
                text-align: right;
                margin-top:44px;
            }
            #dvPreview
            {
                margin-top: 20px;
                margin-left: 80px;
            }
            #fid
            {
                font-size:15px;
                color:black;
                background-color: darkseagreen;
                
            }
            #faid
            {
                font-size:15px;
              color:black;
                background-color: darkseagreen;
                
            }
            #can{
                width: 150px;
                height: 150px;
                border: 2px solid black;
                margin-left: 40px;
            }
            #fname
            {
                margin-top:20px;    
            }
            #lname
            {
                margin-top: -20px;
                margin-left: 550px;
            }
            #faname
            {
                margin-top:20px;
            }
            #mname
            {
                margin-top:-20px;
                margin-left:550px;
            }
            #category
            {
                margin-top:20px;
            }
            #pswd
            {
                margin-top:20px;
            }
            #phone
            {
                margin-top:-20px;
                margin-left:550px;
            }
            #state
            {
                margin-top:20px;
            }
            #cityname
            {
                margin-top:-20px;
                margin-left:670px;
            }
        </style>
        <title>Joint Admission Test 2017::Registration</title>
</head>
<body id="bordr">
<%
Connection con=null;
String url="jdbc:mysql://localhost:3306/examination";
String uname1="root";
String pass="";
PreparedStatement st=null;
ResultSet rs=null;
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url,uname1,pass);
}catch(Exception e)
{
	e.printStackTrace();
}
%>
<%
int a,b,c,d,flag;
Random rand = new Random();
a=rand.nextInt(10);
do
{
    flag=0;
 while(a==5 || a==6 || a==0)
     a=rand.nextInt(10);
  b=rand.nextInt(10);
while(b==5 || b==6 || b==0)
     b=rand.nextInt(10);
 c=rand.nextInt(10);
while(c==5 || c==6 || c==0)
     c=rand.nextInt(10);
 d=rand.nextInt(10);
while(d==5 || d==6 || d==0)
     d=rand.nextInt(10);
id="" +a+b+c+d;
System.out.println("Your id is "+id);
query="select * from register where  uid=?";
try
{
    st =con.prepareStatement(query);
	st.setString(1,id);
	rs = st.executeQuery();
	if (!rs.next())
	{
		System.out.println("Your id submitted is "+id);
		session.setAttribute("userid", id);
		flag=0;
		break;
	}
	else
	{
		flag=1;
	}

}catch(Exception ex)
{
	ex.printStackTrace();
}
}while(flag==1);
%>            
<h1 style=";margin-left:33%;font-family:Arial"><u>New User Registration</u></h1>
        <br/>
         <br />
        <br />
	<div style="margin-left:150px">
	<form action="register_data.jsp" method="post" name="myForm" onsubmit="myFunction()">
First name
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="fid" name='fname' onblur="validate('fname',this.value)"/><span style="display:inline-block; width: 250px; "></span>
Last name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="text"  name="lname" onblur="validate('lname',this.value)" style="font-size:15px;color:black;background-color:darkseagreen">
        <div id='fname' style="color:red;font-size:15px"></div><span style="display:inline-block; width: 250px; "></span><div id='lname' style="color:red;font-size:15px"></div><br/><br/><br/>
Father's name
    <input type="text" id="faid" name='faname' onblur="validate('faname',this.value)"/><span style="display:inline-block; width: 250px;"></span>
Mother's name
	<input type="text" id="mname1" name='mname' onblur="validate('mname',this.value)" style="font-size:15px;color:black;background-color:darkseagreen">
        <div id='faname' style="color:red;font-size:15px"></div><span style="display:inline-block; width: 250px; "></span><div id='mname' style="color:red;font-size:15px"></div><br/><br/><br/>
Category 
	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select id="sel1" style="background-color:darkseagreen;font-size:20px;color:black;" name='category' onblur="validate('category',this.value)"><option>select</option><option value="GEN">GEN</option>
	 <option value="SC">SC</option>
	 <option value="ST">ST</option>
	 <option value="OBC">OBC</option></select>
	 <div id='category' style="color:red;font-size:15px"></div><br/><br/>
Password
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" id="pswd1" name='pswd' onblur="validate('pswd',this.value)" style="font-size:15px;color:black;background-color:darkseagreen"/><span style="display:inline-block; width: 250px; "></span>
Phone no.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="phn1"name='phone' onblur="validate('phone',this.value)"style="font-size:15px;color:black;background-color:darkseagreen"/>
	<br/><div id='pswd' style="color:red;font-size:15px"></div><span style="display:inline-block; width: 250px; "></span><div id='phone' style="color:red;font-size:15px"></div><br/><br/><br/>
D.O.B&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="date" name ="date1" style="font-size:15px;color:black;background-color:darkseagreen"/><br/><br/><br/>
 
Gender:&nbsp;&nbsp;&nbsp;<input type="radio" id="gen" name="gen" style="font-size:50px;color:white;background-color:darkseagreen" value='m'/>&nbsp;&nbsp; Male&nbsp;&nbsp; <input type="radio" name="gen" style="font-size:50px;color:blue;background-color:darkseagreen" value='f' />&nbsp;&nbsp;&nbsp;&nbsp; Female
<br/><br/><br/>
    
        
        Address line 1 &nbsp;&nbsp;<input type="text" size="30"; id="address11" name='address1' onblur="validate('address1',this.value)" style="font-size:15px;size: 200 ;color:black;background-color:darkseagreen">
        <br/><br/><div id='address1' style="color:red;font-size:15px"></div><br/>
        Address line 2&nbsp;&nbsp;<input type="text" size="30" id="address21" name="address2" style="font-size:15px;size:200;color:black;background-color:darkseagreen"><br/><br/><br/>
        Address line 3&nbsp;&nbsp;<input type="text" size="30" id="address31" name="address3" style="font-size:15px;size:200;color:black;background-color:darkseagreen"><br/><br/><br/>State:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select id="sel" style="background-color:darkseagreen;font-size:20px;color:black;" name='state' onblur="validate('state',this.value)"><option>select</option><option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Orissa">Orissa</option>
<option value="Pondicherry">Pondicherry</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Tripura">Tripura</option>
<option value="Uttaranchal">Uttaranchal</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="West Bengal">West Bengal</option>
<option>Telengana</option></select><span style="display:inline-block;width:240px"></span>
    City <input type="text" id="cityname1" name='cityname' onblur="validate('cityname',this.value)"style="font-size:15px;color:black;background-color:darkseagreen">&nbsp;&nbsp;&nbsp;
 <div id='state' style="color:red;font-size:15px"></div><span style="display:inline-block; width: 250px; "></span><div id='cityname' style="color:red;font-size:15px"></div><br/><br/><br/>
    Pincode&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="10" id="pincode1" name="pincode" onblur="validate('pincode',this.value)"style="font-size:15px;size:200px;color:black;background-color:darkseagreen">
    <br/><br/><div id="pincode" style="color:red;font-size:15px"></div><br/>
   
         
       
        <script>
            function upload()
            {
                var imgcanvas=document.getElementById("can");
                var fileinput=document.getElementById("finput");
                var image=new SimpleImage(fileinput);
                image.drawTo(imgcanvas);
                
            }
            
        </script>
        <script src="http://www.dukelearntoprogram.com/course1/common/js/image/SimpleImage.js">   
        </script>
        
        <p>
        <input style="font-size:15px;color:black;background-color:darkseagreen" type="file" multiple="false" id="finput" onchange="upload()">
        <canvas id="can" name="canv">   
        </canvas>
        </p>
        <br/><br/><br/><br/>
	<input style="font-size:15px;color:black;background-color:darkseagreen" type="submit"/>&nbsp;&nbsp;&nbsp;&nbsp; <input style="font-size:15px;color:black;background-color:darkseagreen" type="reset"/> 
	</form>
	</div>
        <p id="copyr">&#x24B8 2017 <a target="_blank" href="https://www.mbm.ac.in" style="text-decoration:none">MBM Engineering College</a></p>
        <script>
        function myFunction()
        {
        	session.setAttribute("imagePath",fileinput);
        }
        </script>
</body>
</html>
