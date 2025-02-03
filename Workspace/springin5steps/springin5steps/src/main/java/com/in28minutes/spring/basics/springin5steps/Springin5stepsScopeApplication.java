package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class Springin5stepsScopeApplication {

	static private org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Springin5stepsScopeApplication.class);

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Springin5stepsScopeApplication.class);

		PersonDAO personDao = appContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = appContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());

	}

}
