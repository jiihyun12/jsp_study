package com.app.order.controller;

import java.io.IOException;
import java.util.Optional;

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
import com.app.vo.OrderVO;

public class OrderWriteController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		MemberDAO memberDAO = new MemberDAO();
		OrderDAO orderDAO = new OrderDAO();
		OrderVO orderVO = new OrderVO();
		
		HttpSession session = req.getSession();
		
		String memberEmail = (String)session.getAttribute("memberEmail");
		Long foundMemberId = memberDAO.selectByEmail(memberEmail).map(MemberVO::getId).orElseThrow(()->{
			throw new RuntimeException();
		});

		orderVO.setMemberId(foundMemberId);
		orderVO.setProductId(Long.parseLong(req.getParameter("productId")));
		orderVO.setProductCount(Integer.parseInt(req.getParameter("productCount")));
		
		orderDAO.insert(orderVO);
		
		
		result.setIdRedirect(true);
		
		return result;
	}

}
