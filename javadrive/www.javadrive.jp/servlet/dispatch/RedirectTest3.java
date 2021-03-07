import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedirectTest3 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();

        log("アクセスされました");

        String url = "/dispatch/redirect.html";
        response.sendRedirect(url);
    }
}
