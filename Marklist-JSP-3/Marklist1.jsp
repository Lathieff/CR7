<%@page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Mark List</title>
</head>
<body>

<%
String sname = request.getParameter("sname");
String regno = request.getParameter("regno");
String clgname = request.getParameter("clgname");
String uname = request.getParameter("uname");

int m1 = Integer.parseInt(request.getParameter("m1"));
int m2 = Integer.parseInt(request.getParameter("m2"));
int m3 = Integer.parseInt(request.getParameter("m3"));
int m4 = Integer.parseInt(request.getParameter("m4"));
int m5 = Integer.parseInt(request.getParameter("m5"));

int total = m1 + m2 + m3 + m4 + m5;
double avg = total / 5.0;

String result;
String grade;

if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35){
    result="PASS";
    if(avg>=90)
        grade="A+";
    else if(avg>=75)
        grade="A";
    else if(avg>=60)
        grade="B";
    else
        grade="C";
}
else{
    result="FAIL";
    grade="NO GRADE";
}
%>

<h2>Bharathiar University Result</h2>

<table border="1" cellpadding="10">
<tr><td>Student Name</td><td><%= sname %></td></tr>
<tr><td>Register Number</td><td><%= regno %></td></tr>
<tr><td>College Name</td><td><%= clgname %></td></tr>
<tr><td>University Name</td><td><%= uname %></td></tr>
<tr><td>Total Marks</td><td><%= total %></td></tr>
<tr><td>Average</td><td><%= avg %></td></tr>
<tr><td>Result</td><td><%= result %></td></tr>
<tr><td>Grade</td><td><%= grade %></td></tr>
</table>

</body>
</html>