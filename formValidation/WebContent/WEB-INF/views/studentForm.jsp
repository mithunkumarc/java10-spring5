<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
  <h2>Student Input From</h2>
  <hr />
  <form:form action="saveStudent" method="post" modelAttribute="student">
    <table>
      <tr>
        <th>Name</th>
        <td>
          <form:input path="name" /> 
          <form:errors path="name" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Email</th>
        <td>
            <form:input path="email" /> 
            <form:errors path="email" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Gender</th>
        <td>
          <form:radiobutton path="gender" value="Male" label="Male" /> 
          <form:radiobutton path="gender" value="Female" label="Female" /> 
          <form:errors path="gender" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th valign="top">Languages</th>
        <td>
          <form:select path="subjects" multiple="true">
            <form:option value="English">English</form:option>
            <form:option value="Kannada">Kannada</form:option>
            <form:option value="Hindi">Hindi</form:option>
            <form:option value="Maths">Maths</form:option>
            <form:option value="Science">Science</form:option>
          </form:select>
          <form:errors path="subjects" cssClass="error" /> 	
         </td>
      </tr>
      <tr>
        <td><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form>
</body>
</html>