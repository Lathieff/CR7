import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ramjan1 extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html;charset=UTF-8");

PrintWriter out = response.getWriter();

String name = request.getParameter("name");

out.println("<h2>Welcome to advanced java: " + name + "!</h2>");

out.println("<html>");
out.println("<head><title>Servlet</title></head>");
out.println("<body>");
out.println("<h1>Servlet ramjan1 at " + request.getContextPath() + "</h1>");
out.println("</body>");
out.println("</html>");
}
}