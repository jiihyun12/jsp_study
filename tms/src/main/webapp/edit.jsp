<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 페이지</title>
</head>
<body>
	<h1>학생 정보 수정</h1>
	<form action="edit-ok.student?id=${student.id}" method="post">
	
		<label>
			<input type="text" name="studentName" placeholder="이름" value="${student.studentName}" />
		</label>
		<label>
			<input type="text" name="math" placeholder="수학"  value="${student.math}" />
		</label>
		<label>
			<input type="text" name="eng" placeholder="영어"  value="${student.eng}"/>
		</label>
		<label>
			<input type="text" name="kor" placeholder="국어"  value="${student.kor}" />
		</label>
		
		<button>등록</button>
	</form>
		
</body>
</html>