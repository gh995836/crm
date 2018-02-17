package com.ccc.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccc.crm.mapper.BaseDictDao;
import com.ccc.crm.pojo.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictDao baseDictDao;

	public List<BaseDict> selectBaseDictListByCode(String code) {
		return baseDictDao.selectBaseDictListByCode(code);
	}
	
	
}
