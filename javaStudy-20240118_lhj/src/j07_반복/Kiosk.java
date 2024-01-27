
package j07_반복;

import java.util.Scanner;



public class Kiosk {

	public static void main(String[] args) throws InterruptedException {
		/*
		 *  <인생네컷>
		 *  
		 *  
		 * 1. 하루필름 (2인)
		 * 2. 포토그레이 (3인)
		 * 3. 항공필름 (4인)
		 * 원하는 인생네컷을 고르시오 : 1
		 * 인원수를 입력하시오 : 2
		 * 
		 * 하루필름을 선택하셨습니다.
		 * (인원을 초과하였습니다.)
		 * 
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * (2초 대기)
		 * 찰칵!
		 * 
		 * 원하는 사진 수를 입력하시오 (짝수만 입력가능) : 
		 * 
		 *  사진1 나왔습니다.
		 *  사진2 나왔습니다.
		 *  사진3 나왔습니다.
		 *  사진4 나왔습니다.
		 *  
		 * 홀수 입력시 
		 * 올바르지 않은 입력입니다
		 * %2 = 0
		 * 
		 * 계속 돈다 while로 돌고 
		 */
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		String result = null;
		int photoCount;

		while (true) {
			
			while(true) {
			System.out.println("1. 하루필름 (2인)");
			System.out.println("2. 포토그레이 (3인)");
			System.out.println("3. 항공필름 (4인)");
			System.out.println("원하는 인생네컷을 고르시오 : ");
			num1 = sc.nextInt();
			if (num1 < 1 || num1 > 3) {
				System.out.println("1-3을 선택 해주세요.");
				break;

			}
			
			System.out.println("인원수를 입력하시오 : ");
			num2 = sc.nextInt();

			if (num1 == 1 && num2 >2 ) {
				System.out.println("인원을 초과하였습니다.");
				break;

			}
			if (num1 == 2 && num2 > 3) {
				System.out.println("인원을 초과하였습니다.");
				break;

			}
			if (num1 == 3 && num2 > 4) {
				System.out.println("인원을 초과하였습니다.");
				break;

			}
			

			switch (num1) {
			case 1: {

				System.out.println("하루필름 (2인)");
				result = "하루필름";
				break;

			}
			case 2: {

				System.out.println("포토그레이 (3인)");
				result = "포토그레이";
				break;

			}
			case 3: {

				System.out.println("항공필름 (4인)");
				result = "항공필름";
				break;

			}

			}
			System.out.println(result + "를 선택하였습니다.");

			int i = 0;
			while (i < 4) {

				System.out.println("찰칵!");

				Thread.sleep(1000);
				i++;
			}
			
		
		while (true) {
			System.out.println("원하는 사진 수를 입력하시오 (짝수만 입력가능) : ");
			photoCount = sc.nextInt();

			if (photoCount % 2 != 0) {
				System.out.println("올바르지 않은 입력입니다.");

			} else {
				System.out.println("사진" + photoCount + "장이 나왔습니다.");
				break;
				

			}
		}
		}

	}

}

}