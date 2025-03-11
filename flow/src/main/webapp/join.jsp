<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join-ok.member" method="post"> 
		<div>
			<input name="memberEmail" placeholder="이메일" />
		</div>
		<div>
			<input type="password" name="memberPassword" placeholder="비밀번호" />
		</div>
		<div>
			<input name="memberName" placeholder="이름을 입력하세요" />
		</div>
		<button>회원가입</button>
	</form>
</body>
</html>