package j11_상속;

public class Human extends Animal {
 // Animal이 부모 클래스
//	public void move() {
//	System.out.println("동물이 움직입니다.");
//}

	public Human() {
		System.out.println("Human 생성자 호출");
	}
	
	
	public void handling() {
		System.out.println("도구를 사용합니다.");
	}
	
	
	
	// 오버라이딩 : 재정의
	
	@Override
		public void move() {
		super.move(); // 최상위 클래스꺼 사용
		System.out.println("딸 피아노 고수");	
		
		}
}
