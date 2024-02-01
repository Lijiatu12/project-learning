package SessionHistory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;



@WebServlet("/cookie01")
public class CookieAA {



public class  Cookie01 extends HttpServlet{

    //重写service
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Cookie cookie1 = new Cookie("keya","vauea");
        Cookie cookie2 = new Cookie("keyb","vaueb");

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);



    }



}
}
