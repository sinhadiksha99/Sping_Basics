package com.handson.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
	public void up()
	{
		System.out.println("PACMAN UP");
	}
	
	public void down()
	{
		System.out.println("PACMAN DOWN");
	}
	
	public void left()
	{
		System.out.println("PACMAN LEFT");
	}
	
	public void right()
	{
		System.out.println("PACMAN RIGHT");
	}

}
