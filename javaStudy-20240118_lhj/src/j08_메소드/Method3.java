package j08_메소드;

public class Method3 {

	/*
	 * 메소드 오버로딩 (함수의 이름은 같고 매개 변수의 개수나 타입이 다름)
	 */
	
	public static void test1()
	{
		System.out.println("매개변수가 없는 test1");
	}
	
	public static void test1(int num) {
		System.out.println("매개변수가 하나이고 int인 test1");
	}
	
	public static void test1(int num1 , int num2)
	{
		System.out.println("매개변수가 하나이고 모두 int인 test1");
	}
	public static void test1(String name , int num2)
	{
		System.out.println("매개변수가 하나이고 String, int인 test1");
	}
	
	
	public static void test1(int name , String num2)
	{
		System.out.println("매개변수가 하나이고 int , String 인 test1");
	}
	
	
	
	public static void main(String[] args) {
	test1();	
	test1(100);
	test1(100,200);
	test1("이현진",200);
	test1(200,"이현진");
	
	

		
		
	}

}
