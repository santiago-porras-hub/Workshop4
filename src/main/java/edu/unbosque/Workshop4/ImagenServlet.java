package edu.unbosque.Workshop4;

import javax.ejb.Singleton;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Random;

@MultipartConfig
@WebServlet( name="charge", value="/charge")
@Singleton
public class ImagenServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String description = request.getParameter("description");
        PrintWriter out = response.getWriter();

        Part filePart = request.getPart("file");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

        char[] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        StringBuilder sb = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        fileName = output;
        out.close();
        System.out.println(fileName);

        InputStream fileContent = filePart.getInputStream();
        response.sendRedirect(request.getContextPath() + "/table2.jsp");
        System.out.println(fileName);

    }
}



