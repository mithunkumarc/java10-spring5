<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request mapping sample</title>
</head>
<body>

<a href="/SpringMVC/link1">get request @RequestMapping</a>
<br>
<br>
<br>
<form action="link2" method="post">
	<input type="submit" value="post request @RequestMapping">
</form>
<br>
<br>
<br>
<a href="/SpringMVC/link3">get request @GetMapping</a>
<br>
<br>
<br>
<form action="link4" method="post">
	<input type="submit" value="post request @PostMapping">
</form>
</body>
</html>