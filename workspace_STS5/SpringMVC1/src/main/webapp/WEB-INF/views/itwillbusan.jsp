<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> /WEB-INF/views/itw illbusan.jsp </h1>

<%=request.getAttribute("msg1") %>

<hr>

<h2> JSP코드보단, EL표현식을 사용권장 </h2>
EL 표현식 : ${msg1 }, ${msg2 }

</body>
</html>