package bean.cheatSheet;

import java.util.Date;

public class Bean {
	
	private Code code;
	private Date date;
	
	public Bean() {
		System.out.println("Bean 기본 생성자");
		
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	private void setNumber(int num) {
		System.out.println("setNumber : " + num);
	}

}
