package edu.unbosque.Workshop4;

import com.google.gson.Gson;

import javax.ejb.Singleton;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet( name="welcome", value="/welcome")
@Singleton
public class CookiesServlet extends HttpServlet {
    lista list = new lista();

    List<lista> list2 = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType( "text/html" );
        response.setContentType("application/json");

        String comentarios = request.getParameter("comentarios");

        try {
            Cookie[] cookies = request.getCookies();
            PrintWriter out = response.getWriter();

            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getValue() != "")
                list.setName(cookies[i].getName() + ": " + cookies[i].getValue());
                out.println(cookies[i].getName() + ": " + cookies[i].getValue());

            }

            list2.add(list);

            String authorsJsonString = new Gson().toJson(list2);

            lista2.add(authorsJsonString);
            System.out.println(authorsJsonString);

            out.println("<html><head><title>Leyendo parámetros</title></head>");
            out.println("<body>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td > NOMBRE </td>");
            out.println("</tr>");

            for(int j=0; j<lista2.size(); j++){

                out.println("<tr>");
                out.println("<td "+list2.get(j).getName()+"</td>");

                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.close();

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
