package j09_클래스.생성자;

public class Constructor1 {
	
	String name;
	int age;
	
	//기본생성자
	//NoArgsConstructor
	//값주입 방법2 -> 생성자를 통한 값주입
	public Constructor1() {
		System.out.println("기본 생성자");
	}

	
	// Constructor1 constructor12 = new Constructor1("홍길동"); 
	// System.out.println(constructor12.name); -> null값이 나옴
	// 위의 name과 밑의 name이 다르기 때문임 
	// 그래서 this를 사용하여 위의 name이 밑의 name이라고 해줘야 참조가 됨
	public Constructor1(String name) {
		this.name  = name; // this는 나 자신을 가르킴
		System.out.println("매개변수 : " + name);
		System.out.println("name을 매개변수로 받는 생성자");
		System.out.println(this); // 나 자신의 주소가 나옴 
		// 즉 나의 주소, 나 자신에게 넣는다
		//객체 자기 자신
		// 객체 -> 데이터 + 기능
	}
	
	//RequiredArgsConstructor
	public Constructor1(int age) {
		this.age = age;
		System.out.println("매개변수 : " + age);
		System.out.println("age을 매개변수로 받는 생성자");
	}
	// 전체생성자
	// AllArgsConstructor
	public Constructor1(String name ,int age) {
		this.name = name;
		this.age = age;
		System.out.println("매개변수 : " + name);
		System.out.println("매개변수 :"+age);
		System.out.println("전체생성자 생성자");
	}
	
	//Args -> Arguments(인수, 매개변수)
}
