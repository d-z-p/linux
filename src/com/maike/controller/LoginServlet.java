package com.maike.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maike.model.Trade;
import com.maike.service.UserService;
import com.maike.service.UserServiceImpe;

/**
 * Servlet implementation class LoginServlet登陆页面
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	UserService userService = new UserServiceImpe();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String uesrPwd = request.getParameter("userPwd");

		int k = userService.judgeLogin(userName, uesrPwd);
		if (k > 0) {
			List<Trade> list = userService.seleTradeAll();
			request.setAttribute("tradeList", list);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}
}
