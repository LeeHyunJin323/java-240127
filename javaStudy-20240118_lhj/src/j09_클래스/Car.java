package j09_클래스;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);
		String company;
		String model;
		String color;
		int km;
		int oil;
		/*
		 * 기본 생성자의 특징
		 * 1. 주소값을 리턴한다.
		 * 2. 클래스명과 동일하다.
		 * *기본 생성자는 생략이 가능하다.
		 */
	      Car() {
			//생성자
	    	 //생략이 되있음
		}
		
		void showInfo(){
			System.out.println("회사명 :"+company);
			System.out.println("모델명 :"+model);
			System.out.println("색상 :"+color);
			
		}
		
		void changeEngineOil()
		{
			
			System.out.print("교체 후 주행거리 :");
			km = sc.nextInt();
			System.out.print("희망주입량(L) :");
			oil = sc.nextInt();
		
			if(km < 9000) {
				System.out.println("9,000km 주행 후 교체하십시오.");
				
				
				
			}else {
			   
				if(oil >5) {
					System.out.println("희망주입량이 5L 이상일 시 최대 5L 만 주입");
				}else
				{
					System.out.println(oil + "L를 교체합니다.");
					System.out.println("주입량을 주입합니다.");
				}
				
				
			}
			
		}
		
	}

