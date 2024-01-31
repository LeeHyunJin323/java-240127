package j09_클래스.생성자;

public class Constructor2 {
	String name;
	int age;
	boolean wishWindow;
	
	// 생성자가 오버로딩 되었을시에는 기본생성자가 생략이 안됨
	public Constructor2() {
		
	} 
	public Constructor2(String name) {
		
		this.name = name;
	}
	public Constructor2(int age) {
		
		this.age = age;
	}
	public Constructor2(boolean wishWindow) {
		super();
		this.wishWindow = wishWindow;
	}
	public Constructor2(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Constructor2(String name, boolean wishWindow) {
		
		this.name = name;
		this.wishWindow = wishWindow;
	}
	public Constructor2(int age, boolean wishWindow) {
		
		this.age = age;
		this.wishWindow = wishWindow;
	}
	public Constructor2(String name, int age, boolean wishWindow) {
		
		this.name = name;
		this.age = age;
		this.wishWindow = wishWindow;
	}

	
	// 가능한 생성자 다 만들기

	
	
}
