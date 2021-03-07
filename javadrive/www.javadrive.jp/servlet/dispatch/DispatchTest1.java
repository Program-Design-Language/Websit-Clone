import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DispatchTest1 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("Shift-JIS");

        String[] seibetsu = request.getParameterValues("seibetsu");
        if (seibetsu[0].equals("íjê´")){
            String disp = "/forwarddansei";
            RequestDispatcher dispatch = request.getRequestDispatcher(disp);
            dispatch.forward(request, response);
        }else{
            String disp = "/forwardjosei";
            RequestDispatcher dispatch = request.getRequestDispatcher(disp);
            dispatch.forward(request, response);
        }
    }
}
