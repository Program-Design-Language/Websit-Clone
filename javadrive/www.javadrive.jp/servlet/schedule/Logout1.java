import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Logout1 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException{

        res.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(true);
        session.invalidate();

        res.sendRedirect("/schedule/LoginPage");
    }
}