package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		/*
		 * 1. 빵(플랫화이트 , 허니 오트 , 파마산 오레가노)
		 * 2. 치즈(모짜렐라,아메리칸, 슈레드)
		 * 3. 토스팅(O / X)
		 * 4. 야채 (뺄거)
		 * 5. 소스 (1.렌치 , 2. 어니언, 3. 후추)
		 * 6. 세트/단품
		 * 
		 */
		String Bread = null;
		String Cheese = null;
		String Toasting = null;
		String Vegetable = null;
		String Sauce = null;
		String Set = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		String Breadresult = null;
		System.out.println("빵을 고르시오 :");
		Bread = sc.nextLine();
		if(Bread.equals("플랫화이트"))
		{
			Breadresult = "플랫화이트";
		}else if(Bread.equals("허니 오트"))
				{
			Breadresult = "허니 오트";
		}else if(Bread.equals("파마산 오레가노"))
				{
			Breadresult = "파마산 오레가노";
		}else {
			Breadresult = "빵을 다시 입력하세요.";
		}
		
		String Cheeseresult = null;
		System.out.println("치즈를 고르시오 :");
		Cheese = sc.nextLine();
		if(Cheese.equals("모짜렐라")) {
			Cheeseresult = "모짜렐라 ";
		}
		else if(Cheese.equals("아메리칸")) {
			Cheeseresult = "아메리칸";
		}
		else if(Cheese.equals("슈레드")) {
			Cheeseresult = "슈레드 ";
		}else {
			Cheeseresult = "치즈를 다시 입력하세요.";
		}
		
		
		String Toastingresult = null;
		
		System.out.println("토스팅 (O ,X 중 하나 선택해주세요.) : ");
		Toasting = sc.nextLine();
		if(Toasting.equals("O"))
		{
			Toastingresult = "토스팅";
		}else if(Toasting.equals("X")){
			Toastingresult = "토스팅 안 된";
		}else {
			Toastingresult = "소스를 다시 입력하세요:";
		}
		
		String Vegetablereuslt = null;
		
		System.out.println("야채 유무 (O ,X 중 하나 선택해주세요.) :");
		Vegetable = sc.nextLine();
		if(Vegetable.equals("O")) {
			Vegetablereuslt = "야채가 든";
		}else if(Vegetable.equals("X"))
		{
			Vegetablereuslt = "야채를 뺀";
		}else {
			Vegetablereuslt = "야채 유무를 다시 입력하세요.";
		}
		
		String Sauceresult = null;
		System.out.println("소스를 고르세요 :");
		Sauce = sc.nextLine();
		if (Sauce.equals("렌치")){
			Sauceresult = "렌치";
		}else if(Sauce.equals("어니언")) {
			Sauceresult = "어니언";
		}else if(Sauce.equals("후추")) {
			Sauceresult = "후추";
		}else {
			Sauceresult = "소스를 다시 입력하세요.";
		}
		String Setresult = null;
		
		System.out.println("세트,단품 골라주세요 :");
		Set = sc.nextLine();
		
		if(Set.equals("세트")) {
			Setresult = "세트";
		}else if(Set.equals("단품")) {
			Setresult = "단품";
		}else {
			Setresult = "세트,단품을 다시 입력하세요.";
		}
		
		System.out.println(Breadresult + Cheeseresult + Toastingresult +Vegetablereuslt  +Sauceresult +Setresult);
		
//		String name = null;
//		System.out.println("치즈 입력 :");
//		name = sc.nextLine();
//		
//		if(name.equals("파마산")) {
//			System.out.println("파마산 입니다.");
//		}else if(name.equals("모짜렐라")) {
//			System.out.println("모짜렐라입니다.");
//		}

	}

}
