package com.in28minutes.rest.demo_springboot_project;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="exam")
@Component
public class ExamServiceConfiguration {
	
	private String name;
	private String url;
	private int numberOfQuestions;
	private int highestMarks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}
	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}
	public int getHighestMarks() {
		return highestMarks;
	}
	public void setHighestMarks(int highestMarks) {
		this.highestMarks = highestMarks;
	}

}
