import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginCheck2 extends HttpServlet {

    protected Connection conn = null;

    public void init() throws ServletException{
        String url = "jdbc:mysql://localhost/auth";
        String user = "authtest";
        String password = "authtest";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e){
            log("ClassNotFoundException:" + e.getMessage());
        }catch (SQLException e){
            log("SQLException:" + e.getMessage());
        }catch (Exception e){
            log("Exception:" + e.getMessage());
        }
    }

    public void destory(){
        try{
            if (conn != null){
                conn.close();
            }
        }catch (SQLException e){
            log("SQLException:" + e.getMessage());
        }
    }

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

        try {
            String sql = "SELECT * FROM user_table WHERE user = ? && pass = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, user);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            log("SQLException:" + e.getMessage());
            return false;
        }
    }
}
