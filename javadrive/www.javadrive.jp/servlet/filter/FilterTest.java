import java.io.*;
import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;

public class FilterTest implements Filter{

    public void doFilter(ServletRequest request, ServletResponse response,
        FilterChain chain){

        try{

            System.out.println("フィルタ実行");

            chain.doFilter(request, response);

        }catch (ServletException se){
        }catch (IOException e){
        }

    }

    public void init(FilterConfig filterConfig) throws ServletException{
    }

    public void destroy(){
    }
}
