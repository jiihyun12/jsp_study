package com.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public Result excute(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException;
}
