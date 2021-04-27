package edu.unbosque.Workshop4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.Random;

@WebServlet( name="welcome", value="/welcome")
public class Servlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("text/html");

        String mamon = "";

        try {
            Cookie[] cookies = request.getCookies();
            PrintWriter out = response.getWriter();

            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getValue() != "")
                    out.println(cookies[i].getName() + ": " + cookies[i].getValue());
                out.println("<br/ >");

            }

            char[] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
            StringBuilder sb = new StringBuilder(10);
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                char c = chars[random.nextInt(chars.length)];
                sb.append(c);
            }
            String output = sb.toString();
            out.println("image: "+output);
            out.close();
        } catch (Exception exp) {

            System.out.println(exp);
        }
    }
}
