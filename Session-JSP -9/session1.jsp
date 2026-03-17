<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<%
String u = request.getParameter("uname");

out.print("Welcome " + u);

// store in session
session.setAttribute("sn", u);
%>

<br><br>

<a href="session2.jsp">Check here</a>

</body>
</html>