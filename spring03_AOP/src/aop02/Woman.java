package aop02;

import org.springframework.stereotype.Component;

@Component
public class Woman implements Developer{
	
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("자바스크립트로 개발한다.");
	}
	

}
