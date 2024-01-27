package j07_반복.랜덤;

import java.util.Scanner;
import java.util.UUID;

public class UUID1 {

	public static void main(String[] args) {
		/*
		 * UUID
		 * 토큰(sdf1-2sdf-15df-2131
		 * 시리얼 번호 등록 - OTP()
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String savePhoto = null;
		String savePhoto2 = null;
//		System.out.println(UUID.randomUUID().toString());

		System.out.print("유저1 이미지 첨부 : ");
		savePhoto = sc.next();
		
		System.out.print("유저2 이미지 첨부 : ");
		savePhoto2 = sc.next();
		
		System.out.print("유저 1 저장된 이미지 : ");
		System.out.println(savePhoto);
		
		System.out.print("유저 2 저장된 이미지 : ");
		System.out.println(savePhoto2);
		
		// 컴퓨터에서 고양이1.jpg 를 두개 받았을 때 
		// 두 사진이 이름만 같지 같은 사진이 아니기 때문에 식별자를 UUID로 
		// 각각 처리해줌
		
	}

}
