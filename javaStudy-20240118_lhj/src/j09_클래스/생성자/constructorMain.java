package j09_클래스.생성자;

public class constructorMain {

	public static void main(String[] args) {
		Constructor1 constructor1 = new Constructor1(); 
		Constructor1 constructor12 = new Constructor1("홍길동"); 
		System.out.println();
		Constructor1 constructor123 = new Constructor1(19); 
		Constructor1 constructor1234 = new Constructor1("홍길동",19); 

		System.out.println(constructor1); // 주소를 리턴
		
		System.out.println(constructor12.name);
	}

}
