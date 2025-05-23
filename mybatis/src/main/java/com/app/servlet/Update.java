package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class Update extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8;");
		
		ProductVO productVO = new ProductVO();
		ProductDAO productDAO = new ProductDAO();
		
//		System.out.println(req.getParameter("id"));
//		System.out.println(req.getParameter("productName"));
//		System.out.println(Integer.parseInt(req.getParameter("productPrice")));
//		System.out.println(Integer.parseInt(req.getParameter("productStock")));
		
		productVO.setId(Long.parseLong(req.getParameter("id")));
		productVO.setProductName(req.getParameter("productName"));
		productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
		productVO.setProductStock(Integer.parseInt(req.getParameter("productStock")));
		
		productDAO.update(productVO);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
