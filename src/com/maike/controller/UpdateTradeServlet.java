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
 * Servlet implementation class UpdateTradeServlet修改页面
 */
@WebServlet("/UpdateTradeServlet")
public class UpdateTradeServlet extends HttpServlet {
    UserService userService = new UserServiceImpe();
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        Integer tradeid = Integer.parseInt(request.getParameter("tradeid"));
        String tradeName = request.getParameter("tradeName");
        String tradePrice = request.getParameter("tradePrice");
        System.out.println(tradeName);
        System.out.println(tradePrice);
        Trade trade= new Trade();
        trade.setTradeId(tradeid);
        trade.setTradeName(tradeName);
        trade.setTradePrice(tradePrice);
        int k = userService.updateTrade(trade);
        List<Trade> list = userService.seleTradeAll();
        request.setAttribute("tradeList", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}