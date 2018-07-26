<%--
  Created by IntelliJ IDEA.
  User: 1234567890
  Date: 7/26/2018
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculater</title>
    <style type="text/css">
        .content {
            height: 300px;
            width: 500px;
            border: 2px black solid;
        }
    </style>
</head>
<body>
<div class="content">
    <h1>Simple Calculater</h1>
    <form method="post" action="simple_calculater">
        <div id="data">
            <table>
                <tr>
                    <td>First operand:</td>
                    <td><input type="text" name="firstnumber" size="30"></td>
                </tr>
                <tr>
                    <td>Operator:</td>
                    <td><input type="text" name="operator" size="30"></td>
                </tr>
                <tr>
                    <td>Second operand:</td>
                    <td><input type="text" name="secondnumber" size="30"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Calculate"></td>
                </tr>
            </table>
        </div>
    </form>
</div>
</body>
</html>
