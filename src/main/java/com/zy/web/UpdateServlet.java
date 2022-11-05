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
 * @CreateTime: 2022/10/30 16:31
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    private UserService service = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决乱码
        request.setCharacterEncoding("utf8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String money = request.getParameter("money");
        // 设置参数
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setName(name);
        user.setMoney(Integer.parseInt(money));
        System.out.println(user);
        service.update(user);
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);
    }
}
