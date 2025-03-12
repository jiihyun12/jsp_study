package com.app.order.controller;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.dao.OrderDAO;
import com.app.vo.MemberVO;

public class OrderListController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		OrderDAO orderDAO = new OrderDAO();
		MemberDAO memberDAO  = new MemberDAO();
		
		HttpSession session = req.getSession();
		String memberEmail = (String)session.getAttribute("memberEmail");
		
		memberDAO.selectByEmail(memberEmail).map(MemberVO::getId).ifPresent((id)->{			
			orderDAO.selectAll(id);
		});
		
		if(memberEmail == null) {
			result.setIdRedirect(true);
			result.setPath("login.member?loginRequired");
			return result;
		};
		
		Long id = memberDAO.selectByEmail(memberEmail).map(MemberVO::getId).orElseThrow(()->{
			throw new RuntimeException("user not found");
		});
		
			
		req.setAttribute("orderList", orderDAO.selectAll(id));
		
		result.setPath("order-list.jsp");
		
		return result;
	}

}
