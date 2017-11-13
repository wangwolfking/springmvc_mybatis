package com.yocaly.ssm.controller;

import java.util.ArrayList;
import java.util.List;

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
	public ModelAndView queryItems() throws Exception {
		// TODO Auto-generated method stub
		List<ItemsCustomer> itemsList = itemsService.findItemsList(null);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList", itemsList);
		mav.setViewName("items/itemsList");
		return mav;
	}
}
