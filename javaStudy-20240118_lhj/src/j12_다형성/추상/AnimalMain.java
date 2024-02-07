package j12_다형성.추상;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		//! 추상클래스의 특징
		// 1. 추상클래스는 객체 생성이 안됨
		
		Animal human = new Human(); // 추상클래스를 상속받은 휴먼은 객체 생성 가능
		human.move();
		

		
		
		
		
	}

}
