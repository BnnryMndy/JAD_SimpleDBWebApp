<%--
  Created by IntelliJ IDEA.
  User: 79197
  Date: 13.09.2021
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Super app!</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
    <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
        <h1>Super app!</h1>
    </div>

    <div class="w3-container w3-center">
        <div class="w3-bar w3-padding-large w3-padding-24">
            <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/list'">List users</button>
            <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/add'">Add user</button>
        </div>
    </div>
</body>
</html>
