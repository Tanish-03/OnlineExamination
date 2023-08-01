import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UpdateProfileServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username != null) {
            String newUsername = request.getParameter("username");
            String newPassword = request.getParameter("password");

            // Logic to update the profile and password in the database (not implemented in this demo)

            response.sendRedirect("profile.html");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
