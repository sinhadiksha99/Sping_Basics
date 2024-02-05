package com.handson.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole{
	public void up()
	{
		System.out.println("SUPERCONTRA UP");
	}
	
	public void down()
	{
		System.out.println("SUPERCONTRA DOWN");
	}
	
	public void left()
	{
		System.out.println("SUPERCONTRA LEFT");
	}
	
	public void right()
	{
		System.out.println("SUPERCONTRA RIGHT");
	}

}
