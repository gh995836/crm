package com.ccc.crm.mapper;

import java.util.List;

import com.ccc.crm.pojo.BaseDict;

public interface BaseDictDao {
	/*
	 * 查询
	 */
	public List<BaseDict> selectBaseDictListByCode(String code);
}
