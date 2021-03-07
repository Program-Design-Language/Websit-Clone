import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DispatchTest2 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("Shift-JIS");

        String[] nensyu = request.getParameterValues("nensyu");
        int nensyu_val = Integer.parseInt(nensyu[0]);

        if (nensyu_val < 2000000){
            request.setAttribute("hantei", "•n–R‚Å‚·‚Ë");
        }else{
            request.setAttribute("hantei", "‘åä•v‚Å‚µ‚å‚¤");
        }

        String disp = "/forwardtest";
        RequestDispatcher dispatch = request.getRequestDispatcher(disp);
        dispatch.forward(request, response);
    }
}
