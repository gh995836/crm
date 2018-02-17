package com.ccc.crm.mapper;

import java.util.List;

import com.ccc.crm.pojo.Customer;
import com.ccc.crm.pojo.QueryVo;

public interface CustomerDao {
	/*
	 * 条件查询客户
	 */
	//总条数
	public Integer customerCountByQueryVo(QueryVo vo);
	//结果集
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	//通过ID查询客户
	public Customer selectCustomerById(Integer id);
	//通过ID修改客户
	public void updateCustomerById(Customer customer);
	//通过ID删除客户
	public void deleteCustomerById(Integer id);
	//增加客户
	public void createCustomer(Customer customer);
}
