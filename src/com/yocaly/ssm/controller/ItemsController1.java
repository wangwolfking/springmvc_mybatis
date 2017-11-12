package com.yocaly.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yocaly.ssm.model.Items;

public class ItemsController1 implements Controller {
	public static Log LOG = LogFactory.getLog(ItemsController1.class);
	Log log2=LogFactory.getLog("org.lavasoft.test");
//	log2.info("33333");
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("123");
		List<Items> itemsList = new ArrayList<Items>();
		Items items1 = new Items();
		items1.setName("联想笔记本");
		items1.setPrice(5000);
		items1.setDetail("联想笔记本就是好！！！");
		itemsList.add(items1);
		Items items2 = new Items();
		items2.setName("dell笔记本");
		items2.setPrice(7000);
		items2.setDetail("dell笔记本非常棒！！！");
		itemsList.add(items2);
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList",itemsList);
		mav.setViewName("WEB-INF/jsp/items/itemsList.jsp");
		LOG.info("end");
		LOG.debug("debug()...");  
		LOG.info("info()...");  
		LOG.error("error()..."); 

		return mav;
	}

}
