package j03_연산자;

public class Operation4_1 {

	public static void main(String[] args) {
		/*
		 * 윤년: 해당 년도가 4의 배수이고 , 100의 배수가 아니거나 400의 
		 * 배수일 때
		 */
		int year = 2024;
		String result;
		
		result = year%4 == 0 && (year%100 != 0 || year%400 == 0) ?"윤년"
				:"윤년 아님";
			System.out.println(result);
			
				
			
			if (year%4 == 0 && (year%100 != 0 || year%400 == 0))
			{
				System.out.println("윤년입니다.");
			}else System.out.println("윤년이 아닙니다.");
			
			/*
			 * ID 필수
			 * PW 필수
			 * E 이메일 필수x
			 * P 필수
			 * 
			 * (ID && PW && P) || E 
			 *  
			 */


	}

}
