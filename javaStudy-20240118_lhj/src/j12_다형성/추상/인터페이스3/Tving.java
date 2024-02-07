package j12_다형성.추상.인터페이스3;

public class Tving implements OTT{
	public void drama() {
		System.out.println("티빙 드라마 시청");
	}
	public void movie() {
		System.out.println("티빙 영화 시청");
	}
	public void animation() {
		System.out.println("티빙 애니메이션 시청");
	}

	public void bundle() {
		System.out.println("1+1입니다.");
	}
}
