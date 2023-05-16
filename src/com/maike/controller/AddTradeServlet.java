package com.maike.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maike.model.Trade;
import com.maike.model.TradeDto;
import com.maike.service.UserService;
import com.maike.service.UserServiceImpe;

/**
 * 增添
 */
@WebServlet("/AddTradeServlet")
public class AddTradeServlet extends HttpServlet {
    UserService userService = new UserServiceImpe();
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTradeServlet() {
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
    	response.setContentType("text/html;charset=utf-8");
    	response.setCharacterEncoding("UTF-8");
    	request.setCharacterEncoding("UTF-8");
    	PrintWriter out = response.getWriter();
    	String tradeName = request.getParameter("tradeName");
        String tradePrice = request.getParameter("tradePrice");
    	
        
       TradeDto tradeDto = new TradeDto();
        tradeDto.setTradeName(tradeName);
        tradeDto.setTradePrice(tradePrice);
        int k = userService.addTrade(tradeDto);
        if(k > 0) {
            List<Trade> list = userService.seleTradeAll();
            request.setAttribute("tradeList", list);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else {
            response.getWriter().append("添加失败").append(request.getContextPath());
            request.getRequestDispatcher("add.jsp").forward(request, response);
        }
    }

}