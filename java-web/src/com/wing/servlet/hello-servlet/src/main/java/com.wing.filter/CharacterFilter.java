package com.wing.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author memory125
 */
// 注意： 过滤器这里导包的时候一定是javax.servlet.Filter这个包
public class CharacterFilter implements Filter {
    // 初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(this.getClass() + " -----------init-------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.setCharacterEncoding("utf-8");

        // 备注：这一句至关重要，务必谨记
        // 让请求继续执行，如果不写，程序到这将被拦截停止
        filterChain.doFilter(servletRequest, servletResponse);
    }

    // 销毁
    @Override
    public void destroy() {
//        System.gc();           // 通知回收垃圾
        System.out.println(this.getClass() + " -----------destroy-------");
    }
}
