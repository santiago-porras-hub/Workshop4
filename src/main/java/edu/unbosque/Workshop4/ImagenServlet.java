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
        InputStream fileContent = filePart.getInputStream();
        response.sendRedirect(request.getContextPath() + "/table2.jsp");
        System.out.println(fileName);

    }
}



