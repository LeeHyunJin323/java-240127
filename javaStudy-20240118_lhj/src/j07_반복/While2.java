package j07_반복;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 입장인원 :  7
		 * 
		 * 익명1이 입장하였습니다.
		 * 익명2이 입장하였습니다.
		 * 익명3이 입장하였습니다.
		 * 익명4이 입장하였습니다.
		 * 익명5이 입장하였습니다.
		 * 익명6이 입장하였습니다.
		 * 익명7이 입장하였습니다.
		 */
	
		Scanner sc = new Scanner(System.in);
		System.out.print("입장인원 :");

		int Person = sc.nextInt();
		int i = 0;
		
		while (i < Person) { // 반복 횟수를 적고 그 이후에 변수에 대해 맞춰줌 
			
			System.out.println("익명" + (i+1)+ "이 입장하였습니다.");
			i++;

		}
		Thread.sleep(1000); //1초 멈춤
		System.out.println();
		
		
//	 i = 7 i --  6 person 끝나버리네
		// 7이 0보다 작을때까지 -- 
		
		
		int i2 = 0;
		while(i2 < Person)
		{
			// 7-0 , 7-1 , 7-2
			System.out.println("익명"+(Person-i2)+"이 퇴장했습니다.");
		i2++;
		}
	}

}
