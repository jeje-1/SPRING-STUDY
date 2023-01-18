package factory;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다음메일을 보내주자
		ConnectorFactory.createSMTPConnector("daum").connect();
		
		//Calendar.getInstance();

	}

}
