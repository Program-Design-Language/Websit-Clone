import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestSample3 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html;charset=Shift_JIS");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("Shift_JIS");

        String tmp;

        String name = "";
        tmp = request.getParameter("name");
        if (tmp == null || tmp.length() == 0){
            name = "���ݒ�ł�";
        }else{
            name = tmp;
        }

        int old;
        tmp = request.getParameter("old");
        if (tmp == null || tmp.length() == 0){
            old = -1;
        }else{
            try{
                old = Integer.parseInt(tmp);
            }catch (NumberFormatException e){
                old = -1;
            }
        }

        String tmps[] = request.getParameterValues("food");
        String food = "";
        if (tmps != null){
            for (int i = 0 ; i < tmps.length ; i++){
                food += tmps[i];
                food += " ";
            }
        }else{
            food = "����܂���";
        }

        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>�T���v��</title>");
        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>�����O�� ");
        sb.append(name);
        sb.append(" �ł�</p>");

        sb.append("<p>�N��� ");
        if (old == -1){
            sb.append("���ݒ�ł�</p>");
        }else{
            sb.append(old);
            sb.append(" �ł�</p>");
        }

        sb.append("<p>�D���ȉʕ��� ");
        sb.append(food);
        sb.append("�ł�</p>");

        sb.append("</body>");
        sb.append("</html>");

        out.println(new String(sb));

        out.close();
    }
}
