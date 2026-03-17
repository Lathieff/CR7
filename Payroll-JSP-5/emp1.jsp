<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Payroll Slip</title>
</head>
<body>

<%
String eid = request.getParameter("eid");
String ename = request.getParameter("ename");

double basic = Double.parseDouble(request.getParameter("basic"));

double hra = basic * 0.20;
double da = basic * 0.10;
double pf = basic * 0.12;

double gross = basic + hra + da;
double net = gross - pf;
%>

<h2>Employee Payroll Slip</h2>

<table border="1" cellpadding="8">
<tr><td>Employee ID</td><td><%=eid%></td></tr>
<tr><td>Employee Name</td><td><%=ename%></td></tr>
<tr><td>Basic Salary</td><td><%=basic%></td></tr>
<tr><td>HRA (20%)</td><td><%=hra%></td></tr>
<tr><td>DA (10%)</td><td><%=da%></td></tr>
<tr><td>PF (12%)</td><td><%=pf%></td></tr>
<tr><td>Gross Salary</td><td><%=gross%></td></tr>
<tr><td>Net Salary</td><td><%=net%></td></tr>
</table>

</body>
</html>