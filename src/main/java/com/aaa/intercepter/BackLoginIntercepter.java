package com.aaa.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.controller.LoginController;
/**
 * 登录拦截器
 * @author lenovo
 *
 */

public class BackLoginIntercepter implements HandlerInterceptor{
	
	/**
	 * 处理器(方法)调用之前执行
	 * 
	 * 返回值：true,向下执行,false,结束
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
	}

	/**
	 * 处理器返回ModelAndView之后,视图解析器处理之前之前调用当前方法
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
		
	}

	/**
	 * 返回响应到客户端之前进行调用
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// 判断是否登录
		HandlerMethod method = (HandlerMethod) arg2;
		String methodName = method.getMethod().getName();
		Class c = method.getBeanType();
		System.out.println(c.isInstance(LoginController.class));
		if (c.equals(LoginController.class) && "BackLogin".equals(methodName)) {
			return true;
		} else {
			HttpSession session = arg0.getSession();
			Object logUser = session.getAttribute("logUser");
			if (null != logUser) {
				return true;
			} else {
				arg1.sendRedirect("../jsp/back/login.jsp");
				return false;
			}
		}

	}
}

