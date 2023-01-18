package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext("configuration");
		
		Book harryPotter = context.getBean("lon", Book.class);
		
		Rent rent = context.getBean("rent", Rent.class);
		
		System.out.println(harryPotter);
		rent.info();
		// TODO Auto-generated method stub

	}

}
