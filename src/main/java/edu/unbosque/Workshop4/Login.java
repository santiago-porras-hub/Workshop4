package edu.unbosque.Workshop4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;


@WebServlet( name="ChargeTable" , value="/charge")
public class Login extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();


        char[] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        StringBuilder sb = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        out.println(output);
    }

}
