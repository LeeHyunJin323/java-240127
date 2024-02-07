package j13_최상위클래스;

public class ToString2 {
	
	private int a;
	private int b;
	@Override
	public String toString() { // 오브젝트의 toString은 주소값을 나타냄
		return "ToString2 [a=" + a + ", b=" + b + "]";
	}
	public ToString2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	

}
