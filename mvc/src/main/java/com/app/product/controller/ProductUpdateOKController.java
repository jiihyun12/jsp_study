package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class ProductUpdateOKController implements Action {

	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		
		ProductDAO produtDAO = new ProductDAO();
		ProductVO productVO = new ProductVO();
		
		productVO.setId(Long.parseLong(req.getParameter("id")));
		productVO.setProductName(req.getParameter("productPrice"));
		productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice"))); 
		productVO.setProductStock(Integer.parseInt(req.getParameter("productStock"))); 
		
		produtDAO.update(productVO);
		
		result.setIdRedirect(true);
		result.setPath("list.product");
		
		
		return result;
	}

}
