<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: xikaixiong
  Date: 2/17/17
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>${headerMessage}</title>
    <form:errors path="student1.*"/>
</head>

<a href="/admissionForm?siteLanguage=en">English</a>
<a href="/admissionForm?siteLanguage=fr">French</a>
<a href="/admissionForm?siteLanguage=zh_CN">Chinese</a>


<body>
<h1>hello.jsp having student form submit to StudentController</h1>
<form action="/submitAdmissionForm" method="post">
    <table>
        <tr>
            <td><spring:message code="studentName"/> </td>
            <td><input type="text" name="studentName"></td>
        </tr>
        <tr>
            <td>studentHobby:</td>
            <td><input type="text" name="studentHobby"></td>
        </tr>
        <tr>
            <td>studentMobile:</td>
            <td><input type="text" name="studentMobile"></td>
        </tr>
        <tr>
            <td>studentDOB:</td>
            <td><input type="text" name="studentDOB"></td>
        </tr>
        <tr>
            <td>studentSkills:</td>
            <td>
                <select name="studentSkills" multiple>
                    <option value="Java Core">Java Core</option>
                    <option value="Spring Core">Spring Core</option>
                    <option value="Spring MVC">Spring MVC</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>studentAddress:</td>
            <td>country: <input type="text" name="studentAddress.country"></td>
            <td>city: <input type="text" name="studentAddress.city"></td>
            <td>street: <input type="text" name="studentAddress.street"></td>
            <td>zip: <input type="text" name="studentAddress.zip"></td>
        </tr>
    </table>
    <input type="submit" value="click to submit">
</form>
</body>
</html>
