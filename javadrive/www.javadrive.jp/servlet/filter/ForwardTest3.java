import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ForwardTest3 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        String disp = "/helloworld";
        RequestDispatcher dispatch = request.getRequestDispatcher(disp);

        System.out.println("フォワードします");

        dispatch.forward(request, response);
    }
}
