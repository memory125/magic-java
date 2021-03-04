package com.wing.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author memory125
 */
// 测试Cookie
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out = resp.getWriter();

        // cookie存在多个
        Cookie[] cookies = req.getCookies();

        if (cookies.length != 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("name"))
                {
                    out.write(cookie.getValue());
                }
            }
        } else {
            out.write("第一次访问本站！");
        }
        Cookie cookie = new Cookie("name", "小明");
        // 设置cookie过有效时间，比如1天: 24 * 60 * 60
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
