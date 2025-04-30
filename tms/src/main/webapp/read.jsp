<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세 정보</title>
</head>
<body>
	<h1>학생 상세 보기</h1>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>수학</th>
			<th>영어</th>
			<th>국어</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		<th>${student.studentName}</th>	
		<th>${student.kor}</th>	
		<th>${student.eng}</th>	
		<th>${student.math}</th>
		<th>${student.total}</th>
		<th>${student.average}</th>	
	</table>
	
    <a href="list.student">목록으로 돌아가기</a>
    <a href="edit.student?id=${student.id}">수정</a>
    <a href="remove.student?id=${student.id}">삭제</a>
</body>
</html>