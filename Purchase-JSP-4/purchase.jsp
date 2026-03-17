<%@page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Order Details</title>
</head>
<body>

<h2>Purchase Order Details</h2>

<%
String OrderNo = request.getParameter("OrderNo");
String CustomerName = request.getParameter("CustomerName");
String ProductName = request.getParameter("ProductName");

int Quantity = Integer.parseInt(request.getParameter("Quantity"));
double Price = Double.parseDouble(request.getParameter("Price"));

String Address = request.getParameter("Address");

double TotalAmount = Quantity * Price;
%>

Order Number: <%=OrderNo%><br>
Customer Name: <%=CustomerName%><br>
Product Name: <%=ProductName%><br>
Quantity: <%=Quantity%><br>
Price Per Unit: <%=Price%><br>
Shipping Address: <%=Address%><br>

<hr>

<b>Total Amount: <%=TotalAmount%></b>

</body>
</html>