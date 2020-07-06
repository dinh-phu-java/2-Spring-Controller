<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 7/6/2020
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/processForm" method="post">
    First Operand: <input type="text" name="firstOperand"><br>
    Second Operand: <input type="text" name="secondOperand"><br>
    <input type="submit" value="+Additional" name="operation">
    <input type="submit" value="-Subtraction" name="operation">
    <input type="submit" value="*Multiplication" name="operation">
    <input type="submit" value="/Division" name="operation">
  </form>
  </body>
</html>
