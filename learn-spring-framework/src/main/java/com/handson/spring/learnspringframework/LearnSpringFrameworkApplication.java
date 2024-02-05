package com.handson.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.handson.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.handson.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
@ComponentScan("com.handson.spring.learnspringframework")//automatically happens we do not to specify  only specify when we want scan in different package
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame game=new MarioGame();
		//SuperContraGame game=new SuperContraGame();

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());

	}
}
