package j07_반복.랜덤;

import java.util.Scanner;
import java.util.UUID;

public class UUID2 {

	public static void main(String[] args) {
		
	
	/*
	 * 
	 * 강아지1_UUID.jpg
	 * 
	 * 이미지 첨부 : 강아지1.jpg
	 * 저장된 이미지 : 강아지1_UUID.jpg
	 * 다운시 이미지명: 강아지1.jpg
	 * 
	 * 
	 * 
	 */		 
		
		Scanner sc = new Scanner(System.in);
		String savePhoto = null;
		String saveImage = null;
		String downImage = null;
		// . 기준으로 앞뒤를 자른다
         

	
		
		// savePhoto에서 받은 문자를 . 기준으로 앞뒤 짜른다
		System.out.print(" 이미지 첨부 : ");
		savePhoto = sc.next();
		// savePhoto에서 받은 문자를 . 기준으로 앞뒤 짜른다.
		
		saveImage = savePhoto.substring(0,savePhoto.indexOf("."))
				+"_"
				+ UUID.randomUUID().toString()
				+savePhoto.substring(savePhoto.indexOf("."),savePhoto.length());
		
		
		
		System.out.print(" 저장된 이미지 : ");
		System.out.println(saveImage);
		
		downImage = saveImage.substring(0,saveImage.lastIndexOf("_"))
				+ saveImage.substring(saveImage.indexOf("."),saveImage.length());
		
		System.out.println("다운시 이미지명 :");
		System.out.println(downImage);
		
		
		
	}

}
