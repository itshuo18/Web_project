package com.itheima.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * ClassName: DemoFilter
 * Package: com.itheima.filter
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/5 9:55
 * @Version: 1.0
 */
//@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Demo 拦截到了请求");
        // 放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy 销毁方法执行了");
        Filter.super.destroy();
    }
}
