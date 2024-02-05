package com.handson.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.handson.spring.learnspringframework.enterprise.example.data.DataService;

@Component
public class BusinessService{
	@Autowired   //FIeld Injection
	private DataService dataService;
	
	//@Autowired(Setter Injection)
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
    //@Autowired //(Constructor INjection)
	public BusinessService(DataService dataService) {
		super();
		System.out.println("COnstructor Injection");
		this.dataService = dataService;
	}

	public long calculateSum()
	{
		long val=0;
		List<Integer>list=dataService.getData();
		for(int i=0;i<list.size();i++)
		{
			val+=list.get(i);
		}
		return val;
	}
}

