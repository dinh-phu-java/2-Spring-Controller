<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 7/6/2020
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <p>Sandwich Condiments</p>
  <form action="processForm" method="post">
    <input type="checkbox" name="sandwich" value="lettuce"> Lettuce <br>
    <input type="checkbox" name="sandwich" value="tomato"> Tomato <br>
    <input type="checkbox" name="sandwich" value="mustard"> Mustard <br>
    <input type="checkbox" name="sandwich" value="sprouted"> Sprouted <br>
    <button>Submit</button>
  </form>
  </body>
</html>
