package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		staticTest.name = "홍길동";
		System.out.println(staticTest.name);
		
		StaticTest staticTest2 = new StaticTest();
		System.out.println(staticTest2.name);
		
		StaticTest staticTest3 = new StaticTest();
		System.out.println(staticTest3.name);
		
//		다 홍길동이 나옴 왜냐면 지금 name이 static이기 떄문에
		// 만들때부터 할당이 받아져있음
		
		StaticTest.name = "홍길남";

		System.out.println(staticTest3.name);
		StaticTest.printTest();
		
		
		
		

	}

}
