<%@ page import="edu.unbosque.Workshop4.lista" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: santi
  Date: 29/04/2021
  Time: 5:26 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FORMULARIO2</title>
</head>
<body>

<table>

    <%
        lista list = new lista();
        List<lista> list2 = new ArrayList<>();
    %>
    <td>

        <tr>
            <input name="userName" type="text" class="form-control" value = "<%= list2 %>" ></td>
        </tr>
    </td>

</table>



</script>

</body>
</html>
