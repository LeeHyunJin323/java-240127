package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();
//		Human human = new Human();
//		Tiger tiger = new Tiger();
//		
//		
//		animal.move();
//		human.move();
//		tiger.move();
//		
//		
//		human.handling();
		
	
		
		Human human = new Human(); 
		Tiger tiger = new Tiger();
		
		human.handling();
		human.move();
		
		System.out.println();
		Animal animal = new Human(); // 상속받아서 업캐스팅이 가능
		// 지금은 Animal로 작성해서 Animal꺼만 사용이 가능
		// 근데 내가 지금 Human에 있는 핸들링을 쓰고 싶으면 다운캐스팅을 해야함
		((Human)animal).handling(); // 다운캐스팅
		//animal. 해서는 handling 사용 불가능
		
		
		//햄버거집에 주문,배달,음료,진동벨
		// 햄버거집에 동일하다 그러니깐 이걸 부모클래스에 만들고
		// 서브웨이에 필요한건 서브웨이 클래스에 만들고 다른게 필요하다면 오버라이딩한다.
		// 맥도날드에 필요한건 맥도날드 클래스에 만든다.
		
		

	}

}
