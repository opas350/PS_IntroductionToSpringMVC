<%--
  Created by IntelliJ IDEA.
  User: javier.reyes.valdez
  Date: 2/16/2017
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>AddMinutes Example</title>
</head>
<body>
<h1>Add Minutes example1</h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td>Minutes Exercise for Today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise"/>
            </td>
            
        </tr>
    </table>
</form:form>
</body>
</html>
