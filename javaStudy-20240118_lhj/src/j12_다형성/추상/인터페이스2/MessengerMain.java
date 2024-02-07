package j12_다형성.추상.인터페이스2;

public class MessengerMain {

	public static void main(String[] args) {
		
		KakaoTalk kakaotalk = new KakaoTalk();
		Instagram instagram = new Instagram();
	
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(kakaotalk);
		MessengerMiddleware messengerMiddleware2 = new MessengerMiddleware(instagram);
		
		/*
		 * 
		 * 집에서 로그인 추가
		 * 어떤거 시청할려고 하면 로그인을 해야함
		 * 회원가입
		 * 
		 * OTT
		 * 넷플릭스 티빙 웨이브
		 * OTTMiddleware
		 * Netflix
		 * 1. sale   -20프로 세일  
		 * 
		 * Tving
		 * 1. bundle  -1+1입니다.
		 *   
		 * Wave
		 * 1.freetier   - 2주 무료 시청입니다.
		 * 
		 * 인터페이스 OTT 생성 해서 3개에 implements
		 * 공통 기능
		 * 1.drama
		 * 2. movie
		 * 3. animation
		 * 
		 * 
		 */
		messengerMiddleware.sendMessage();
		messengerMiddleware.receiveMesseage();
		System.out.println();
		messengerMiddleware.runAddOns(); 
		System.out.println();
		
		messengerMiddleware2.sendMessage();
		messengerMiddleware2.receiveMesseage();
		System.out.println();
		messengerMiddleware2.runAddOns();
		// 메신저를 내려야함 
		// runaddOns()
		// 카카오톡이면 선물 보냅니다.
		// 인스타이면 스토리를 보낸다.

	}

}
