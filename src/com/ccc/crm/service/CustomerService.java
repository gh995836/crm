package com.ccc.crm.service;

import com.ccc.common.utils.Page;
import com.ccc.crm.pojo.Customer;
import com.ccc.crm.pojo.QueryVo;

public interface CustomerService {
	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	
	public Customer selectCustomerById(Integer id);
	
	public void updateCustomerById(Customer customer);
	
	public void deleteCustomerById(Integer id);
	
	public void createCustomer(Customer customer);
}
