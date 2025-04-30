<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록</title>
</head>
<body>
	<h1>학생 목록</h1>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>수학</th>
			<th>영어</th>
			<th>국어</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		
		<c:forEach var="student" items="${studentList}">
			<tr>
				<th>
					<a href="read.student?id=${student.id}">
						${student.studentName}
					</a>
				</th>
				<th>${student.math}</th>
				<th>${student.eng}</th>
				<th>${student.kor}</th>
				<th>${student.total}</th>
				<th>${student.average}</th>
			</tr>
		</c:forEach>
		
	</table>
	
	
</body>
</html>