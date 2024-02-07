package j12_다형성.추상.빌딩;

public class BulidingMain {

	public static void main(String[] args) {
		
		Buliding Lctbuliding = new Lct(); 
		Buliding dbrtkabuliding = new Building63(); 
		Buliding Lotterbuliding = new LotterTower(); 
		
		
		
		// 건물이 있다 치면 엘리베이트 ,화재 , 계단이 필수로 필요하다면 추상으로 메소드만 선언해놓고
		// 건물이라는 클래스를 만들게 되면 상속받아서 추상메소드를 정의해주면 됨 
		
		
		// 초고층빌딩법안(BuliddingLaw)
		//*엘리베이터
		// *화재
		//* 피난용 계단
		//
		
		//롯데타워 클래스 (LotterTower)
		//-전망대
		
		// 63빌딩(Building63)
		//- 아쿠아리움
		
		//엘시티(Lct)
		//- 워터파크
		
		//엘시티하청(LctLow)
		// *고속엘레베이터

	}

}
