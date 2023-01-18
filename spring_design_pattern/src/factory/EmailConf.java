package factory;

public enum EmailConf {
	
	NAVER_CONF("smtp.naver.com","mc","1234abc", 5000),
	DAUM_CONF("smtp.daum.net","mc","1234abc",5000),
	GOOGLE_CONF("smtp.google.com","mc","1234abc",5000);
	
	public final String URL;
	public final String ID;
	public final String Password;
	public final int TIMEOUT_MS;
	
	private EmailConf(String URL, String ID, String Password, int TIMEOUT_MS) {
		this.URL = URL;
		this.ID = ID;
		this.Password = Password;
		this.TIMEOUT_MS = TIMEOUT_MS;
	}
	
	

}
