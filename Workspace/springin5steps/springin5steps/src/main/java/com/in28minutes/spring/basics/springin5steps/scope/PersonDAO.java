package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	public int findTheMax() {
		int max = Integer.MIN_VALUE;
		int [] data = jdbcConnection.getData();
		for(int x: data) {
			if(x > max) {
				max = x;
			}
		}
		return max;
	}

}
