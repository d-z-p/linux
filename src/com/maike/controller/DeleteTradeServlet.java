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
 * Servlet implementation class DeleteStuServlet删除
 */
@WebServlet("/DeleteStuServlet")
public class DeleteTradeServlet extends HttpServlet {
    UserService userService = new UserServiceImpe();
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
        Integer pid = Integer.parseInt(request.getParameter("pid"));
        System.out.println(pid);
        String tradeName = request.getParameter("tradeName");
        int  k = userService.deleteTrade(pid);
        List<Trade> list = userService.seleTradeAll();
        request.setAttribute("tradeList", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}