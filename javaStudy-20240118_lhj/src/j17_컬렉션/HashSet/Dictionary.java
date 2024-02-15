package j17_컬렉션.HashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		/*
		 * 축구(soccer)
		 * 야구(baseball)
		 * 농구(baskeball)
		 * 골프(golf)
		 * 
		 * [사전]
		 * 1. 검색기능 ( 종료 q)
		 * 2. 추가기능 ( 종료 q)
		 * 3.  전체 조회
		 * # 프로그램 종료(exit)
		 * 
		 * 1선택
		 * 검색어 : 축구
		 * soccer
		 * 검색어 : 농구
		 * basketball
		 * q
		 * 
		 * 2선택
		 * 한글:볼링
		 * 영문: bowling
		 * 
		 * 한글 : 배구
		 * 영어 : volleyball
		 * q
		 * 
		 * 
		 * 3선택
		 * 		 * 축구(soccer)
		 * 야구(baseball)
		 * 농구(baskeball)
		 * 골프(golf)
		 * 기존에있던거랑 추가된거 다 보여줌
		 * 
		 */

		HashMap<String, String> strMap  = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		
		int number ;
		String n = null;


		// 일단 맵만들어서 축구 농구 넣자
		strMap.put("축구", "soccer");
		strMap.put("야구", "baseball");
		strMap.put("농구", "basketball");
		strMap.put("골프", "golf");
	
		
//		System.out.println(strMap.keySet()); // 키값만 가져옴
		
	
		

		
		while(true) {
			System.out.println("[사전]");
			System.out.println("1. 검색기능 ( 종료 q)");
			System.out.println("2. 추가기능 ( 종료 q)");
			System.out.println("3.  전체 조회");
			System.out.println("# 프로그램 종료(exit)");
			
			String  select = null;
			select = sc.nextLine();
			if(select.equals("1")) {
				// 검색어 : 축구
				// soccer이 ㄴ오도록
				while(true) {
					Iterator<String> irKey = strMap.keySet().iterator();
				System.out.print("검색어 :");
			
				n = sc.nextLine();
				if(n.equals("q")) {
					break;
				}
				//System.out.println(strMap.get());
				
				while(irKey.hasNext()) {
					String str = irKey.next(); //키 값하나씩 들어감
					if(str.equals(n))
					{
						System.out.println(strMap.get(str));
						
					
					}
				}
					
				}
			}else if (select.equals("2")){
			
				
				String plusText = null;
				String plusEnglish = null;
				while(true) {
					System.out.print("한글");
					plusText = sc.nextLine();
					
					if(plusText.equals("q"))break;
					
					System.out.print("영어:");
					plusEnglish = sc.nextLine();
					
					strMap.put(plusText, plusEnglish);
					
				}
				System.out.println(strMap);
			}else if (select.equals("3")) {
				for(String key: strMap.keySet()) {
					System.out.println(key+"(" + strMap.get(key)+ ")");
				}
				//keyset은 키값만 가져옴 키값을 key에 넣고 key 랑 get(key)
				
			}else if (select.equals("exit")) {
				break;
			}

				
//
//				while(ir.hasNext()) {
//					String str = ir.next();
//					if(str.equals("2")) {
//						System.out.println(str);
//					}
//				}
				
			
			
			
		}
		
	}

}
