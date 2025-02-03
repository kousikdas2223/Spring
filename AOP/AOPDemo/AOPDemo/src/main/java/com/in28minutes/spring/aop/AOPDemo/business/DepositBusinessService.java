package com.in28minutes.spring.aop.AOPDemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.AOPDemo.data.OLTDataServiceDAO;

@Service
public class DepositBusinessService {
	
	@Autowired
	OLTDataServiceDAO oltDataServiceDao;
	
	public String submitDeposit() {
		System.out.println("Called the NewContract Service");
		return oltDataServiceDao.getDataFromOracle(); 
	}

}
