<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>
	<div> 학생 정보 등록 </div>
	
	
	<form action="write-ok.student" method="post">
		<label>
			<input type="text" name="studentName" placeholder="이름" />
		</label>
		<label>
			<input type="text" name="math" placeholder="수학" />
		</label>
		<label>
			<input type="text" name="eng" placeholder="영어" />
		</label>
		<label>
			<input type="text" name="kor" placeholder="국어" />
		</label>
		<button type="submit">등록</button>
	</form>
	
	<form action="list.student" method="post">
		<button>
			목록으로
		</button>
	</form>
</body>
</html>
