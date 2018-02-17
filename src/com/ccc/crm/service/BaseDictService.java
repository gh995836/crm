package com.ccc.crm.service;

import java.util.List;

import com.ccc.crm.pojo.BaseDict;

public interface BaseDictService {
	public List<BaseDict> selectBaseDictListByCode(String code);
}
