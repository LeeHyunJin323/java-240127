package j05_입력;

import java.util.Scanner;

public class input4 {

	public static void main(String[] args) {
		/*
		 * <자기소개 프로그램>                   변수명
		 * 이름 : 홍길동 next()                  name
		 * 나이 : 18  nextInt()                  age
		 * 주소 : 부산 진구 가야동 nextLine()    adderss
		 * 연락처 : 010-3300-4698 next()         phone
		 */
		
		/*
		 * 출력
		 * 사용자의 이름은 홍길동이고 나이는 18세 입니다.
		 * 주소는 부산 진구 가야동 입니다.
		 * 연락처는 010-3300-4698입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		String name; // 이름
		String address; // 주소
		String phone; // 연락처 
		int age; // 나이
		
		System.out.print("이름 :");
		 name = sc.next();
		
		System.out.print("나이 :");
		 age = sc.nextInt();
		sc.nextLine(); // ??????????? 앤터가 밑으로 들어가서 
		// 25라 치고 엔터치면 엔티러르 밑의 nextLine이 먹어버려서 넘어가버림
		
		System.out.print("주소 :");
		 address = sc.nextLine();
		
		System.out.print("연락처 :");
		 phone = sc.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age +" 입니다.");
		System.out.println("주소는" + address + " 입니다.");
		System.out.println("연락처는"+ phone + "입니다.");
		
		
	// -> nextInt에서 18 받고 다음 nextInt에서 엔터를 받아버려서 주소받는창 캔슬하고 다음 연락처 받는 칸이 나옴
		// 즉 nextLine에서 엔터만 받아진거임
//		next에 뜨워쓰기 홍길동을 치면 스페이스바 먹어버리고 홍길동이 출력됨
		// 그래서 next next해도  빈공간 먹어버리고 홍길동 처리되면서 오류 x
		
		

	}

}
