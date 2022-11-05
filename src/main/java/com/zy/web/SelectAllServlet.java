package com.zy.web;

import com.zy.bean.User;
import com.zy.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Title: ${NAME}
 * @Package ${PACKAGE_NAME}
 * @Author: xiaozhang
 * @Copyright 版权归xiaozhang所有
 * @CreateTime: 2022/10/29 17:09
 */
@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    private UserService service = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = service.selectAll();
        request.setAttribute("lists",users);
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}
