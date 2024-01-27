package j07_반복;

public class DoubleWhile1 {

	public static void main(String[] args) {
		/*
		 * 2단 
		 * 2x1 = 2
		 * 2x2 = 4
		 * ...
		 * 2x9 = 18
		 */
		
		// 위 한번 밑에 9번
		
		int i = 0;
		int j=0;
		while(i <5) {
			System.out.println("i :" +i);
			
			while (j==3) {
				System.out.println("j는 1이다");
				break;
				
			}j++;
			i++;
		}
//		int i = 0;
//		int j = 2;
//		while(i<9) {
//			
//		}

	}

}
