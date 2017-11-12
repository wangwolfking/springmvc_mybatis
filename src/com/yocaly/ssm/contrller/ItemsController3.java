package com.yocaly.ssm.contrller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yocaly.ssm.model.Items;

@Controller
public class ItemsController3{
	@RequestMapping("/queryItems4.action")
	public ModelAndView queryIems() throws Exception {
		// TODO Auto-generated method stub
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
		Items items3 = new Items();
		items3.setName("联想笔记本think");
		items3.setPrice(35000);
		items3.setDetail("联想think笔记本就是好！！！");
		itemsList.add(items3);
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList",itemsList);
		mav.setViewName("WEB-INF/jsp/items/itemsList.jsp");
		return mav;
	}
}
