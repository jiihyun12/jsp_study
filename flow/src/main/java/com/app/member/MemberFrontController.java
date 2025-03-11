package com.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.member.controller.MemberJoinController;
import com.app.member.controller.MemberJoinOkController;
import com.app.member.controller.MemberLoginController;
import com.app.member.controller.MemberLoginOkController;

public class MemberFrontController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
	    resp.setContentType("text/html; charset=utf-8;");
	      
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		
		if(target.equals("join")) {
			result = new MemberJoinController().excute(req, resp);
		}else if(target.equals("join-ok")) {
			result = new MemberJoinOkController().excute(req, resp);
		}else if(target.equals("login")) {
			result = new MemberLoginController().excute(req, resp);
		}else if(target.equals("login-ok")) {
			result = new MemberLoginOkController().excute(req, resp);
		}else {
			// 전부 404
		}
		
		
		if(result != null) {
			if(result.isIdRedirect()){
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
				
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
