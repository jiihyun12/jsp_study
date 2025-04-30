package com.app.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.dto.StudentDTO;

public class StudentListController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		
		
		StudentDAO studentDAO = new StudentDAO();
        List<StudentDTO> studentList = studentDAO.selectAll();
        
        req.setAttribute("studentList", studentList);
        
        studentList.forEach(System.out::print);
        
        
		result.setPath("list.jsp");
		return result;
	}

}
