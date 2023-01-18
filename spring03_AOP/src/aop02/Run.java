package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("aop02/config.xml");
		
		Developer man = context.getBean("man", Developer.class);
		Developer woman = context.getBean("woman", Developer.class);
		
		System.out.println(man instanceof Developer);
		System.out.println(man instanceof Man);
		
		man.develop();
		System.out.println("-----------------------------");
		woman.develop();

	}

}
