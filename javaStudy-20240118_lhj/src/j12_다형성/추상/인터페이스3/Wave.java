package j12_다형성.추상.인터페이스3;

public class Wave implements OTT{
	public void drama() {
		System.out.println("웨이브 드라마 시청");
	}
	public void movie() {
		System.out.println("웨이브 영화 시청");
	}
	public void animation() {
		System.out.println("웨이브 애니메이션 시청");
	}

	public void freetier() {
	 System.out.println("2주간 무료 시청입니다.");
	}
}
