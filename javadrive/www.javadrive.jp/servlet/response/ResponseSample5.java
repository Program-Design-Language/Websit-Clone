import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResponseSample5 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();

        String tmp;

        String url = "";
        tmp = request.getParameter("url");
        if (tmp == null || tmp.length() == 0){
            url = "http://www.excite.co.jp/";
        }else{
            url = "http://" + tmp;
        }

        response.sendRedirect(url);
    }
}