<%@ page import="java.security.SecureRandom" %>
<%@ page import="edu.unbosque.Workshop4.lista" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> TABLAS </title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body  background="img/fondo.png">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<link rel="stylesheet" href="css/components.css">
<link rel="stylesheet" href="css/navegation.css">
<%
    if(!request.getParameter("userName").equals("")){

        out.println("Login succes");
        out.println("<br />");

        String name = request.getParameter("userName");


        Cookie c1 = new Cookie("userName", request.getParameter("userName"));

        response.addCookie(c1);


        out.println("<br />");
        out.print("<a href='welcome'> Too see Details (Cookies) please tap here </a> ");


    } else
        out.println("Login Failed");

%>

<table>




    <form  class="border p-3 form" action="charge" method="post" enctype="multipart/form-data" >
    <tr>
        <td>Description for image :</td>
        <td ><textarea name="comentarios" rows="10" cols="40" style="background: transparent"> Write Here..</textarea ></td>

    </tr>

    <tr>
        <td>
            <input type="file" id="Foto" name="file"  accept="image/*" onchange="mostrar()"/>
            <br>
            <img id="img"/>
        </td>

    </tr>
<td>
    <button type="submit" class="btn btn-primary" >SUBMIT</button>
                </div>
</table>

</body>
</html>
