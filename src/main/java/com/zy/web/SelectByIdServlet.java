package com.zy.web;

import com.zy.bean.User;
import com.zy.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Title: ${NAME}
 * @Package ${PACKAGE_NAME}
 * @Author: xiaozhang
 * @Copyright 版权归xiaozhang所有
 * @CreateTime: 2022/10/30 16:37
 */
@WebServlet("/selectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
    private UserService service = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ids = request.getParameter("id");
        int id = Integer.parseInt(ids);
        User user = service.selectById(id);
        System.out.println(user);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }
}
