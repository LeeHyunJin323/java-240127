package j09_클래스.접근지정자;

public class TestA_2 {
	
	int ta2;
	public void TestA2() {
		System.out.println("testA2 메소드 호출");
		TestA_1 testA = new TestA_1();
		
		testA.ta = "TestA_2에서 값 주입";
		testA.TestA1();

		System.out.println(testA.ta);
		
		
	}
	
	

}
