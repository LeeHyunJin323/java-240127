package j07_반복;

public class For1 {

	public static void main(String[] args) {
//	
//		for (int i = 0 ; i<5; i++) {
//			System.out.println(i);
//		
//		}
//		
		System.out.println("for 후");
		/*
		 * <for문의 기본형태>
		 * for(초기치;조건문;증가치){
		 * 
		 *     실행할 문장 a;
		 *     실행할 문장 b;
		 *     ...
		 */
		
		// for로 구구단 만들기
		int num, num2;
		for(int i = 0 ; i<8; i++) {
			
			num = i+2;
			System.out.println();
			System.out.println(num+"단");
			System.out.println();
			for (int j=0; j<9; j++)
			{
				
				num2 = j+1;
				
				System.out.println(num + "X " + num2 +" = "+ num*num2);
			}
		}
		
		/*
		 * 함수
		 * googoodan()
		 * 
		 * 
		 * 클래스 1차 산
		 * 
		 */
	}

}
