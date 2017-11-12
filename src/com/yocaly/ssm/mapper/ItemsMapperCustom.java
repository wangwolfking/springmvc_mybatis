package com.yocaly.ssm.mapper;

import java.util.List;

import com.yocaly.ssm.model.ItemsCustomer;
import com.yocaly.ssm.model.ItemsQueryVo;

public interface ItemsMapperCustom {
//	商品查询列表
	public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsqueryVo) throws Exception;
}
