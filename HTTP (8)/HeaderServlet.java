import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html;charset=UTF-8");

PrintWriter out = response.getWriter();

out.println("<html>");
out.println("<head><title>Request Headers</title></head>");
out.println("<body>");

out.println("<h2>HTTP Request Header</h2>");
out.println("<table border='1'>");
out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

Enumeration<String> headerNames = request.getHeaderNames();

while(headerNames.hasMoreElements()){
String headerName = headerNames.nextElement();
String headerValue = request.getHeader(headerName);

out.println("<tr>");
out.println("<td>" + headerName + "</td>");
out.println("<td>" + headerValue + "</td>");
out.println("</tr>");
}

out.println("</table>");
out.println("</body>");
out.println("</html>");
}
}