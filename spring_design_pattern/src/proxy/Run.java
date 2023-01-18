package proxy;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer man = new DeveloperProxy(new Man());
		Developer woman = new DeveloperProxy(new Woman());
		Developer child = new DeveloperProxy(new Child());

		man.develop();
		System.out.println("=======================");
		woman.develop();
		System.out.println("=======================");
		child.develop();
		System.out.println("=======================");
		
	}
	


}
