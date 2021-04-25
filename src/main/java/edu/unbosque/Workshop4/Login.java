package edu.unbosque.Workshop4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name="loginWithCookies" , value="/login-with-cookies")
public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{

        response.setContentType("text/html");

        String name = request.getParameter("userName");
        String password = request.getParameter("UserPassword");



        try {
            PrintWriter out= response.getWriter();
            if (name.equals("unbosque") && password.equals("1234")) {

                Cookie c1 = new Cookie("userName", name);
                Cookie c2 = new Cookie("UserPassword", password);

                response.addCookie(c1);
                response.addCookie(c2);

                out.print("WELCOME :" + name );
                out.println("<br/ >");
                out.print("<a href='welcome'> Too see Details (Cookies) please tap here </a> ");

            } else
                out.println("Login Failed");
            out.close();
        }catch (Exception exp){
            System.out.println(exp);
        }

    }
}
