package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 추상 생성해서
		 * data에 "홍길동" 전달
		 * num1 , num2 에 10,20 전달해서 실행
		 */
		
		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.showData("홍길동");

		abstractTest.add(10, 20);
		
		// 익명 클래스 -> 추상 클래스 만들 때 상속받을 클래스가 필요함
		// 그럼 짧은 익명클래스ㅡㄹ 사용하는데도 두개 만들어야하니 불편함
		// 그래서 익명 클래스 생성해줌
		
		
		AbstractTest abstractTest2 = new AbstractTest() {
			
			@Override
			public void showData(String data) {
				System.out.println("여기서만 실행");
				
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("여기서만 실행2");
				
			}
		};

		abstractTest2.showData("홍길동");
		abstractTest2.add(10, 20);

	}

}
