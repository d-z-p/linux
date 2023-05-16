package com.maike.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maike.service.UserService;
import com.maike.service.UserServiceImpe;

/**
 * Servlet implementation class RegisterServlet注册页面
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    UserService userService = new UserServiceImpe();
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");
        String userRePwd = request.getParameter("userRePwd");
        
        int k = userService.insertUser(userName,userPwd,userRePwd);
        
        if(k > 0) {
        	System.out.println("成功");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }

}