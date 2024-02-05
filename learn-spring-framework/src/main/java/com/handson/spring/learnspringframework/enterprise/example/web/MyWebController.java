package com.handson.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handson.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	@Autowired
	private BusinessService businessService;

	public MyWebController(BusinessService businessService) {
		super();
		System.out.println("Constructor Injection in businessService");
		this.businessService = businessService;
	}

	
	public long returnValueFromBusinessService()
	{
		return businessService.calculateSum();
	}

}


