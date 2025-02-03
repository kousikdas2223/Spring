package com.in28minutes.spring.aop.AOPDemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class DMODataServiceDAO {
	
	public String getDMOData() {
		return "DMO Data Received";
	}

}
