import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ramjan1")
public class ramjan1 extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();

String customername = request.getParameter("customername");
String productname = request.getParameter("productname");
String quantity = request.getParameter("quantity");
String price = request.getParameter("price");
String address = request.getParameter("address");

double total = Integer.parseInt(quantity) * Double.parseDouble(price);

out.println("<html><body>");

out.println("<p><b>Customer Name:</b> " + customername + "</p>");
out.println("<p><b>Product Name:</b> " + productname + "</p>");
out.println("<p><b>Quantity:</b> " + quantity + "</p>");
out.println("<p><b>Price per unit:</b> " + price + "</p>");
out.println("<p><b>Shipping Address:</b> " + address + "</p>");
out.println("<p><b>Total Amount:</b> " + total + "</p>");

out.println("</body></html>");
}
}