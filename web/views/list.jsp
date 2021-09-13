<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 79197
  Date: 12.09.2021
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <ul>
        <%
            List<String> names = (List<String>) request.getAttribute("userNames");

            if(names != null && !names.isEmpty()){
                for (String s:names
                     ) {
                        out.println("<li>"+s+"</li>");
                }
            }
        %>
    </ul>
</body>
</html>
