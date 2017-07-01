<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: xikaixiong
  Date: 2/17/17
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hi.jsp</title>
    <form:errors path="student1.*"/>
</head>
<body>
<h1>hi.jsp</h1>
<h3>Congratulations!! the student information is below:</h3>


<tabel>
    <tr>
        <th>student name:</th>~
        <td>${student1.studentName}</td>
        <td><br></td>
    </tr>
    <tr>
        <th>student hobby:</th>
        <td>${student1.studentHobby}</td>
        <td><br></td>
    </tr>
    <tr>
        <th>student Mobile:</th>
        <td>${student1.studentMobile}</td>
        <td><br></td>
    </tr>
    <tr>
        <th>student DOB:</th>
        <td>${student1.studentDOB}</td>
        <td><br></td>
    </tr>
    <tr>
        <th>student skills:</th>
        <td>${student1.studentSkills}</td>
        <td><br></td>
    </tr>
    <tr>
        <td>student address:</td>
        <td>country: ${student1.studentAddress.country}</td>
        <td>city: ${student1.studentAddress.city}</td>
        <td>street: ${student1.studentAddress.street}</td>
        <td>zip: ${student1.studentAddress.zip}</td>
        <td><br></td>
    </tr>
</tabel>
</body>
</html>
