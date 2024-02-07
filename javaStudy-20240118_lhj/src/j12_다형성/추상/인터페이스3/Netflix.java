package j12_다형성.추상.인터페이스3;

public class Netflix implements OTT{
	
	public void drama() {
		System.out.println("넷플릭스 드라마 시청");
	}
	public void movie() {
		System.out.println("넷플릭스 영화 시청");
	}
	public void animation() {
		System.out.println("넷플릭스 애니메이션 시청");
	}
	
	public void sale() {
		System.out.println("20% 세일합니다.");
	}

}
