package com.yocaly.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yocaly.ssm.model.ItemsCustomer;
import com.yocaly.ssm.service.ItemsService;

@Controller
public class ItermsController {
	@Autowired
	private ItemsService itemsService;

	// 商品的查询
	@RequestMapping("/queryItems.action")
	public ModelAndView queryItems(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<ItemsCustomer> itemsList = itemsService.findItemsList(null);
		System.out.println(123);
		String requestUrl = request.getRequestURL().toString();// 得到请求的URL地址
		String requestUri = request.getRequestURI();// 得到请求的资源
		String queryString = request.getQueryString();// 得到请求的URL地址中附带的参数
		String remoteAddr = request.getRemoteAddr();// 得到来访者的IP地址
		String remoteHost = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String remoteUser = request.getRemoteUser();
		String method = request.getMethod();// 得到请求URL地址时使用的方法
		String pathInfo = request.getPathInfo();
		String localAddr = request.getLocalAddr();// 获取WEB服务器的IP地址
		String localName = request.getLocalName();// 获取WEB服务器的主机名
//		 response.setCharacterEncoding("UTF-8");//设置将字符以"UTF-8"编码输出到客户端浏览器
		 //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
//		 response.setHeader("content-type", "text/html;charset=UTF-8");
//		 PrintWriter out = response.getWriter();
		 System.out.println("获取到的客户机信息如下：");
		 System.out.println("<hr/>");
		 System.out.println("请求的URL地址："+requestUrl);
		 System.out.println("<br/>");
		 System.out.println("请求的资源："+requestUri);
		 System.out.println("<br/>");
		 System.out.println("请求的URL地址中附带的参数："+queryString);
		 System.out.println("<br/>");
		 System.out.println("来访者的IP地址："+remoteAddr);
		 System.out.println("<br/>");
		 System.out.println("来访者的主机名："+remoteHost);
		 System.out.println("<br/>");
		 System.out.println("使用的端口号："+remotePort);
		 System.out.println("<br/>");
		 System.out.println("remoteUser："+remoteUser);
		 System.out.println("<br/>");
		 System.out.println("请求使用的方法："+method);
		 System.out.println("<br/>");
		 System.out.println("pathInfo："+pathInfo);
		 System.out.println("<br/>");
		 System.out.println("localAddr："+localAddr);
		 System.out.println("<br/>");
		 System.out.println("localName："+localName);
		 System.out.println("getContentType"+request.getContentType());

		//doGet11(request, response);
//		response.setCharacterEncoding("UTF-8");// 设置将字符以"UTF-8"编码输出到客户端浏览器
		// 通过设置响应头控制浏览器以UTF-8的编码显示数据
//		response.setHeader("content-type", "text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
		Enumeration<String> reqHeadInfos = request.getHeaderNames();// 获取所有的请求头
		System.out.println("获取到的客户端所有的请求头信息如下：");
		System.out.println("<hr/>");
		while (reqHeadInfos.hasMoreElements()) {
			String headName = (String) reqHeadInfos.nextElement();
			String headValue = request.getHeader(headName);// 根据请求头的名字获取对应的请求头的值
			System.out.println(headName + ":" + headValue);
			System.out.println("<br/>");
		}
		System.out.println("<br/>");
		System.out.println("获取到的客户端Accept-Encoding请求头的值：");
		System.out.println("<hr/>");
		String value = request.getHeader("Accept-Encoding");// 获取Accept-Encoding请求头对应的值
		System.out.println(value);

		Enumeration<String> e = request.getHeaders("Accept-Encoding");
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			System.out.println(string);
		}
		System.out.println(123);
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList", itemsList);
		//mav.setViewName("test/jsp/items/itemsList");
		mav.setViewName("login/jsp/login");
		return mav;
	}
}
