import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginCheck1 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        HttpSession session = request.getSession(true);

        boolean check = authUser(user, pass);
        if (check){
            /* 認証済みにセット */
            session.setAttribute("login", "OK");

            /* 本来のアクセス先へ飛ばす */
            String target = (String)session.getAttribute("target");
            response.sendRedirect(target);
        }else{
            /* 認証に失敗したら、ログイン画面に戻す */
            session.setAttribute("status", "Not Auth");
            response.sendRedirect("/auth/Login");
        }
    }

    protected boolean authUser(String user, String pass){
        /* 取りあえずユーザー名とパスワードが入力されていれば認証する */
        if (user == null || user.length() == 0 || pass == null || pass.length() == 0){
            return false;
        }

        return true;
    }
}
