package com.kgc.springbootymw.utils;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SystemInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletRequest.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        //设置跨域请求
        httpServletResponse.setHeader("Access-Control-Allow-Origin","http://127.0.0.1:8848");
        httpServletResponse.setHeader("Access-Control-Allow-Methods","POST, GET, PUT, OPTIONS, DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");

        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
