package com.in28minutes.spring.aop.AOPDemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class OLTDataServiceDAO {
	
	public String getDataFromOracle() {
		return "Oracle Data Received";
	}

}
