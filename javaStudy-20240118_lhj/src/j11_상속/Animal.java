package j11_상속;

public class Animal {
	
	public Animal() {
		super(); // super가 생략이 되있음 super -> 부모을 가르킴
		System.out.println("Animal 생성자 호출");
	}
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}
	
	public void run() {
		System.out.println("동물이 달리기를 합니다.");
	
	}

}
