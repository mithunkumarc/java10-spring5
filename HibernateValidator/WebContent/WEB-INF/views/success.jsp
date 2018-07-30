<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Home page</title>
</head>
<body>
  <h2>Student Success From</h2>
  <hr />

  <table>
    <tr>
      <th>Name</th>
      <td>${student.name}</td>
    </tr>
    <tr>
      <th>Email</th>
      <td>${student.email}</td>
    </tr>
    <tr>
      <th>Gender</th>
      <td>${student.gender}</td>
    </tr>
    <tr>
      <th valign="top">Subjects</th>
      <td>${student.subjects}</td>
    </tr>
  </table>
</body>
</html>