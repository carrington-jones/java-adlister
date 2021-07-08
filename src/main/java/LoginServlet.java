import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isUser = username.equals("user") && password.equals("password");

        HttpSession session = request.getSession();

        if (isUser) {
            session.setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }







        //Set the session object to a variable based on the HttpSession class.
//        HttpSession session = request.getSession();

//        String darkMode = request.getParameter("color");

        //set the dark theme attribute on the session so that it gets remembered every time we log in.
//        session.setAttribute("darkMode", darkMode);

        //on a different servlet (profile page)
        //with our getAttribute method, our return is always a generic Object type.
        //therefore we need to explicitly cast the object to the correct type
//        session.getAttribute("darkMode");
//        String darkSelected = (String) session.getAttribute("darkMode");

        //Can also remove attributes
//        session.removeAttribute("darkMode");

        //invalidate session. Destroys session.
//        session.invalidate();
    }
}
