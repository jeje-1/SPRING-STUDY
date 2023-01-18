package configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Rent {
	
	@Autowired
	private User user;
	
	@Autowired
	private Book book;


	public void info() {
		System.out.println(user.getName() + "이(가) " + book.getTitle() + "를(을) 대여하였습니다.");
	}

}
