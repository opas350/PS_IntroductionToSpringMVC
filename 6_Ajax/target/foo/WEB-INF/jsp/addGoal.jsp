<%--
  Created by IntelliJ IDEA.
  User: javier.reyes.valdez
  Date: 2/20/2017
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
    <style>
        .error {
            color: #FF0000;
        }

        .errorblock{
            color: #000;
            background-color: #FFEEEE;
            border: 3px solid #FF0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<form:form commandName="goal">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Enter Minutes</td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td><form:errors path="minutes" cssClass="error"/> </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Goal Minutes">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
