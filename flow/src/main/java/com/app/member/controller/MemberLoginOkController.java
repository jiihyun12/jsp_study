package com.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.vo.MemberVO;

public class MemberLoginOkController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		HttpSession session = req.getSession();
		
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		String memberEmail = null;
						
		memberVO.setMemberEmail(req.getParameter("memberEmail"));
		memberVO.setMemberPassword(req.getParameter("memberPassword"));
		
		memberEmail = memberDAO.selectByEmailAndPassword(memberVO);
				
		result.setIdRedirect(true);	
		
		if(memberEmail == null) {
			result.setPath(req.getContextPath() + "/login.member?login=false");
			return result;
		}
		
		session.setAttribute("memberEmail", memberEmail);
		result.setPath(req.getContextPath() + "/list.product");		
		return result;
	}

}
