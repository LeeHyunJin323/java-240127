package j11_상속.factory;

import j11_상속.Human;

public class FactoryMain4 {

	public static void main(String[] args) {
		Factory factory = new SamsungFactory(1);
		Factory factory2 = new LGFactory(1);
//		SamsungFactory samsung = new SamsungFactory(1);
//		Factory sfactory = samsung;
//		SamsungFactory sumsung2 = (SamsungFactory)sfactory;
		
	
		
		
		//System.out.println(factory instanceof SamsungFactory);
		// 팩토리의 근본이 삼성이니??? true면 맞음
		
		//System.out.println(factory2 instanceof SamsungFactory);
		//false
		/*
		 * 공장 6개(팩토리 배열)
		 * 삼성1
		 * 삼성2
		 * 엘지1
		 * 삼성3
		 * 엘지2
		 * 엘지3
		 * 
		 * 
		 * 가동-생산-중지
		 * 삼성1 공장을 가동합니다.
		 * 스마트폰생산
		 * 삼성1공장을 중지합니다.
		 * 
	     * 삼성2 공장을 가동합니다.
		 * 스마트폰생산
		 * 삼성2공장을 중지합니다.
		 * 
		 * 엘지1 공장을 가동합니다.
		 * 스마트TV생산
		 * 일지1공장을 중지합니다.
		 */
		Factory[] fac = new Factory[6];
		fac[0] = new SamsungFactory(1);
		fac[1] = new SamsungFactory(2);
		fac[2] = new LGFactory(3);
		fac[3] = new SamsungFactory(4);
		fac[4] = new LGFactory(5);
		fac[5] = new LGFactory(6);
		
 		
		
		for (int i = 0; i < fac.length; i++) {
		    if (fac[i] instanceof SamsungFactory) {
		    	fac[i].start();
		        ((SamsungFactory) fac[i]).produceSmartPhone();
		    	fac[i].stop();
		    }
		} 
		
		for (int i = 0; i < fac.length; i++) {
		if(fac[i] instanceof LGFactory)
		{
			fac[i].start();
			((LGFactory) fac[i]).produceSmartTV();
			fac[i].stop();
		}
		}
		
		

	}

}
