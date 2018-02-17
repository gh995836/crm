package com.ccc.crm.service;
/**
 * 带分页条件查询用户
 * @author home
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccc.common.utils.Page;
import com.ccc.crm.mapper.CustomerDao;
import com.ccc.crm.pojo.Customer;
import com.ccc.crm.pojo.QueryVo;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	
	@Autowired
	private CustomerDao customerDao;
	// 通过四个条件 查询分页对象
	public Page<Customer> selectPageByQueryVo(QueryVo vo) {
		Page<Customer> page = new Page<Customer>();
		//显示页码总数目  页码数=总记录数/设置的数字
		page.setSize(10);
		//每页显示记录数
		vo.setSize(10);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getCustName() && !"".equals(vo.getCustName().trim())){
				vo.setCustName(vo.getCustName().trim());
			}
			if(null != vo.getCustSource() && !"".equals(vo.getCustSource().trim())){
				vo.setCustSource(vo.getCustSource().trim());
			}
			if(null != vo.getCustIndustry() && !"".equals(vo.getCustIndustry().trim())){
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
			if(null != vo.getCustLevel() && !"".equals(vo.getCustLevel().trim())){
				vo.setCustLevel(vo.getCustLevel().trim());
			}
			//总条数
			page.setTotal(customerDao.customerCountByQueryVo(vo));
			
			page.setRows(customerDao.selectCustomerListByQueryVo(vo));
		}
		return page;

	}
	/*
	 * 通过ID查询用户
	 * @see com.ccc.crm.service.CustomerService#selectCustomerById(java.lang.Integer)
	 */
	public Customer selectCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.selectCustomerById(id);
	}
	
	//通过ID修改客户
	public void updateCustomerById(Customer customer) {
		customerDao.updateCustomerById(customer);
	}
	//通过ID删除客户
	public void deleteCustomerById(Integer id) {
		customerDao.deleteCustomerById(id);
	}
	public void createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
	}
	
}
