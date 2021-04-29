package edu.unbosque.Workshop4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "cretateLibraryServlet", value = "/create-library")
public class FormServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

       lista list = new lista();

        List<lista> list2 = new ArrayList<>();

        response.setContentType("text/html");

        String name = request.getParameter("name");
        list.setName(name);

        list2.add(list);

        response.sendRedirect("./index.jsp");
    }

}
