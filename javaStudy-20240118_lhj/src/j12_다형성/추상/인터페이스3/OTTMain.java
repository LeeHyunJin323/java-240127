package j12_다형성.추상.인터페이스3;

public class OTTMain {
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
	public static void main(String[] args) {
		Netflix netflix = new Netflix();
		Tving tving = new Tving();
		Wave wave = new Wave();
		

		OTTMiddleware netflixott = new OTTMiddleware(netflix);
		OTTMiddleware tvingott = new OTTMiddleware(tving);
		OTTMiddleware waveott = new OTTMiddleware(wave);
		
		OTTMiddleware[] OTTM = new OTTMiddleware[3];
		
		OTTM[0] = new OTTMiddleware(netflix);
		OTTM[1] = new OTTMiddleware(tving);
		OTTM[2] = new OTTMiddleware(wave);
		
		for(int i = 0; i<OTTM.length; i++)
		{
			OTTM[i].ssdrama();
			OTTM[i].ssanimation();
			OTTM[i].ssmovie();
			OTTM[i].runAddOns();
			System.out.println();
		}
		
//		netflixott.ssanimation();
//		netflixott.ssdrama();
//		netflixott.ssmovie();
//      	netflixott.runAddOns();
//      	
//      	System.out.println();
//      	tvingott.ssanimation();
//		tvingott.ssdrama();
//		tvingott.ssmovie();
//      	tvingott.runAddOns();
//      	System.out.println();
//      	waveott.ssanimation();
//		waveott.ssdrama();
//		waveott.ssmovie();
//      	waveott.runAddOns();
		// 인터페이스 배열만들어서 넷플릭스 , 티빙, 왓챠 , 카테고리별로 시청되도록
	}

	
	
	
	

}
