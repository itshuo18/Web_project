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
public class AbcFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Abc 拦截到了请求");
        // 放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

}
