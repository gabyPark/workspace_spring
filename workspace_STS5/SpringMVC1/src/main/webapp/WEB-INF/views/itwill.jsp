<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>WEB-INF/views/itwill.jsp</h1>
    
    
    <h2> 전달된 상품 정보 </h2>
    ("key",value) 전달한 경우<br>
    -> el 표현식에서 key값으로 호출
    
    ${vo } <br>
    
    ${vo.name }<br>
    ${vo.price }<br>
    ${vo.model }<br>
    
    <hr>
    (value) 전달한 경우 <br>
    => 전달하는 타입의 첫 글자를 소문자로 변경 후 
       el 표현식에서 호출<br>
    
    ${productVO }<br>
    ${productVO.name }<br>
    ${productVO.price }<br>
    ${productVO.model }<br>
   

</body>
</html>