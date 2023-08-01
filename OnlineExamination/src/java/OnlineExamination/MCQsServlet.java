import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MCQsServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username != null) {
            String q1Answer = request.getParameter("q1");
            String q2Answer = request.getParameter("q2");

            // Logic to store the selected answers and calculate scores (not implemented in this demo)

            response.sendRedirect("results.html");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
