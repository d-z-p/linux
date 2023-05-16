package com.maike.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maike.model.Trade;
import com.maike.service.UserService;
import com.maike.service.UserServiceImpe;

/**
 * Servlet implementation class ToUpdateTradeServlet
 */
@WebServlet("/ToUpdateTradeServlet")
public class ToUpdateTradeServlet extends HttpServlet {
    UserService userService = new UserServiceImpe();
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ToUpdateTradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	Integer tradeId = Integer.parseInt(request.getParameter("tradeId"));
        System.out.println(tradeId+"");
        Trade trade = userService.getTradeByName(tradeId);
        request.setAttribute("trade", trade);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}