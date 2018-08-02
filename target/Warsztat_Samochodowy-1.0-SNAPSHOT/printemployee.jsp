<%--
  Created by IntelliJ IDEA.
  User: hensa
  Date: 01.08.2018
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Lista pracowników</title>
</head>
<body>
<table>
    <c:forEach items="${employee}" var="employee">
        <tr>
            <td>${employee}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>