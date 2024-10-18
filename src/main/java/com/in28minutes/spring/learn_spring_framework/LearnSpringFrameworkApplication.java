package com.in28minutes.spring.learn_spring_framework;
import com.in28minutes.spring.learn_spring_framework.enterprise.example.MyWebController;
import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.learn_spring_framework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);// parameterized constructor
		runner.run();
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());



	}

}
