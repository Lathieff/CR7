<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<%
String name = (String) session.getAttribute("sn");

out.print("Hello user, you entered the name: " + name);
%>

</body>
</html>