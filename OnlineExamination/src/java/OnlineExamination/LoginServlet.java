import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Logic to validate the username and password (not implemented in this demo)

        if (isValidUser(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("profile.html");
        } else {
            response.sendRedirect("login.html");
        }
    }

    private boolean isValidUser(String username, String password) {
        // Add logic to validate the user from a database or other sources
        // For this demo, we assume a hardcoded valid username and password
        return username.equals("demo") && password.equals("password");
    }
}
