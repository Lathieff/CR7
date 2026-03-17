import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data1")
public class data1 extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html;charset=UTF-8");

PrintWriter out = response.getWriter();

String name = request.getParameter("un");
String pass = request.getParameter("pw");

out.println("<html><body><center>");

if("Ram".equals(name) && "2810".equals(pass)){
out.println("<h2>Welcome " + name + " You are a valid user</h2>");
}
else{
out.println("<h2>Invalid User</h2>");
}

out.println("</center></body></html>");
}
}