<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 7/6/2020
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SandWitch Result</title>
</head>
<body>
<ul>
 <c:forEach items="${sandwich}" var="sand">
     <li>${sand}</li>
 </c:forEach>
</ul>
</body>
</html>
