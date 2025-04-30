package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.dto.StudentDTO;
import com.app.vo.StudentVO;

public class StudentWriteOkController implements Action {

    @Override
    public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Result result = new Result();
        StudentDAO studentDAO = new StudentDAO();
        StudentVO studentVO = new StudentVO();

        // 데이터 받아서 VO에 담기
        studentVO.setStudentName(req.getParameter("studentName"));
        studentVO.setMath(Integer.parseInt(req.getParameter("math")));
        studentVO.setEng(Integer.parseInt(req.getParameter("eng")));
        studentVO.setKor(Integer.parseInt(req.getParameter("kor")));

        // DB에 insert
        studentDAO.insert(studentVO);
		/* Long insertedId = studentDAO.selectId(); */

        // list 페이지로 리다이렉트
        result.setRedirect(true);
        result.setPath("list.student");

        return result;
    }
}

