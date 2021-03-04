package com.wing.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author memory125
 */
// Session测试
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        // 得到session
        HttpSession session = req.getSession();

        // 给session存入属性
        session.setAttribute("name", "David");

        // 获取session的ID
        String sessionId = session.getId();

        // 判断session是否为新
        if (session.isNew()) {
            resp.getWriter().write("session创建成功，ID是：" + sessionId);
        } else {
            out.write("session已经在服务器中存在了，ID为：" + sessionId);
            out.write("<br>");
            out.write(session.getAttribute("name").toString());
            System.out.println(session.getAttribute("name").toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
