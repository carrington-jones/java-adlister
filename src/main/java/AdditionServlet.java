import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "AdditionServlet", urlPatterns = "/add")
public class AdditionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int num1 = 0;
        int num2 = 0;
        boolean goofDetected = false;

        try {
            num1 = Integer.parseInt(req.getParameter("num1"));
        } catch (NumberFormatException nfe){
            out.println("UHOH!");
        }

        try {
            num2 = Integer.parseInt(req.getParameter("num2"));
        } catch (NumberFormatException nfe){
            out.println("UHOH2!");
        }
        if (!goofDetected) {
            out.println("<h1>" + num1 + " + " + num2 + " = " + (num1 + num2) + "</h1>");
        }
    }
}
