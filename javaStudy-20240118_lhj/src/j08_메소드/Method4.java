package j08_메소드;

import java.util.Scanner;

public class Method4 {
	
	

	public static void method(String name)
	{
		System.out.println("이름은 "+name+"입니다.");
		System.out.println("나이는 미입력입니다.");

	}
	public static void method(int age)
	{
		System.out.println("이름은 미입력입니다.");
		System.out.println("나이는 "+age+"입니다.");
		
		
	}
	public static void method(String name,int age) // String 두개로 받으면 큰일나겠네 ...
	{
		System.out.println("이름은 "+name+"입니다.");
		System.out.println("나이는"+age+"입니다.");
		
	}
	
	public static void method(int age, String name)
	{
		System.out.println("이름은 "+name+"입니다.");
		System.out.println("나이는"+age+"입니다.");
	
		
	}

	public static void main(String[] args) {
		/*
		 * <설문>
		 * 이름 : 홍길동
		 * 나이 : 18
		 * 
		 *  이름은 홍길동이고 나이는 18세 입니다.
		 *  
		 *  이름 : 홍길동
		 *  나이 : 엔터
		 *  이름은 홍길돌입니다.
		 *  나이는 미입력입니다.
		 *  
		 *  이름 : 엔터
		 *  나이 : 20
		 *  나이는 20세입니다.
		 *  이름은 미입력입니다.
		 *  
		 *  오버로딩 무조건 사용하시오.
		 * 
		 * 
		 * 
		 */
	
	
		String name = null;
		String age = null;
		
		
		
         Scanner sc = new Scanner(System.in);
         System.out.print("이름을 입력하세요:");
         name = sc.nextLine();
      
         
         System.out.print("나이를 입력하세요:");
         //여기서 나이 입력 해야하는데 엔터 받았을때 이 scanner문이 멈춰야함
         age = sc.nextLine();
         
         
         
         
         
		if(age == "")
		{
			method(name);
		
		}else if(name == "") {
			method(Integer.parseInt(age));   // Integer.parseInt -> String을 int로 형 변환    
		}else {
		method(name,Integer.parseInt(age));
		}
		
	
		
	}
	
	}


