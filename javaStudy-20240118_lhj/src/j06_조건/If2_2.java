package j06_조건;

import java.util.Scanner;

public class If2_2 {

	public static void main(String[] args) {
		/*
		 * 학점 판독기
		 * 점수(score)
		 * 점수를 입력하시오 : 97
		 * 
		 * 점수가 89점 초과 A학점 입니다.
		 * 점수가 79점 초과 B학점 입니다.
		 * 점수가 69점 초과 C학점 입니다.
		 * 점수가 59점 초과 D학점 입니다.
		 * 점수가 59점 이하 F학점 입니다.
		 * 점수가 0점이하이거나 100점 초과이면 -> 계산불가
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int score;
		String result = null;
		System.out.println("점수를 입력하시오 :");
		score = sc.nextInt();
		
		if(score <= 0 || score >= 100) {
			result = "계산불가";
		}else if(score > 89){
			System.out.println("A학점 입니다.");
			
		}
		else if(score > 79){
			result = "B학점 입니다.";
			
		}

		else if(score > 69){
			result =  "C학점 입니다.";
			
		}

		else if(score >= 59){
			result = "D학점 입니다.";
			
		}

		else{
			result = "F학점 입니다.";
			
		}

		System.out.println( result +"입니다.");
		
		// name.equals("모짜렐라));
/*
 * 1. 빵(플랫화이트 , 허니 오트 , 파마산 오레가노)
 * 2. 치즈(모짜렐라,아메리칸, 슈레드)
 * 3. 토스팅(O / X)
 * 4. 야채 (뺄거)
 * 5. 소스 (1.렌치 , 2. 어니언, 3. 후추)
 * 6. 세트/단품
 * 
 */
	}

}
