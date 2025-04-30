package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.dto.StudentDTO;

public class StudentEditController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		
		Long id = Long.parseLong(req.getParameter("id"));
		
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO studentDTO = new StudentDTO();
		
		studentDTO = studentDAO.select(id);
		req.setAttribute("student", studentDTO); 
		
		result.setPath("edit.jsp");
		return result;
	}

}
