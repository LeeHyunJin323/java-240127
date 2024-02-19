package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 정수 , 정수 받아서 두 정수 더한 값을 리턴하는 함수
		 * calc함수 만들기
		 * 10,20
		 */
		Math<Integer, Integer> math = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				
				return value1 + value2;
			}
		};
		
		//math2 만들어서 3.14 , 4.44
		

		Math<Double, Double> math2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				
				return value1+value2;
				
			
			}
		};
		
		
		System.out.println(math2.calc(3.14, 4.44));

		Math<Double , Double> math3 = (v1,v2) -> v1 + v2;
		System.out.println(math3.calc(3.14, 4.44));
		
		Math<Double , Double> math4 = (v1,v2) ->{
			System.out.println("hi");
			return 3.14;
			
		};
		// return 외에 실행문이 없을시 중괄호와 return이 생략 가능하다.
		/*
		 * minus라는 메소드 만들고 num1 - num2 람다식 만들기
		 */

		
		
	}

}
