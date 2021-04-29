<%--
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


<script>
    function printTable(userName, comentarios = []) {
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function() {
            if (xhr.readyState == 4) {
                var data = JSON.parse(xhr.responseText);
                var tbodyRef = document.getElementById(elementId).getElementsByTagName('tbody')[0];
                data.map(d => {
                    var newRow = tbodyRef.insertRow();
                    columns.map(c => {
                        var cell = newRow.insertCell();
                        var text = document.createTextNode(d[c]);
                        cell.appendChild(text);
                    });
                    if (actions.includes('charge')) {
                        var cell = newRow.insertCell();
                        var action = document.createElement('charge');
                        action.setAttribute('onclick', 'location.href="./form-book.jsp?authorId=' + d['authorId'] + '";');
                        var text = document.createTextNode('Create book');
                        action.appendChild(text);
                        cell.appendChild(action);
                    }
                });
            }
        }
        xhr.open('GET', '${pageContext.request.contextPath}/' + servlet, true);
        xhr.send(null);
    }
    // Printing libraries
    printTable(elementId = 'userName', servlet = 'list-comentarios', columns = ['libraryId', 'name']);
    // Printing authors
    printTable(elementId = 'authorsTbl', servlet = 'list-authors', columns = ['authorId', 'name', 'numBooks'], actions = ['create-book']);
</script>

</body>
</html>
