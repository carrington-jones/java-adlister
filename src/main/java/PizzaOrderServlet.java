import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String[] toppings = req.getParameterValues("toppings");
        String address = req.getParameter("address");

        PrintWriter out = resp.getWriter();

        out.printf("<h1>Crust: %s</h1>" +
                "<h1>Sauce: %s</h1>" +
                "<h1>Size: %s</h1>", crust, sauce, size);

        out.println("<h1>Toppings:</h1>");
        for (String topping : toppings) {
            out.printf("<h1>%s</h1>", topping);
        }
        out.println("<h1>Delivery Address:</h1>");
        out.printf("<h3>%s</h3", address);


    }
}

