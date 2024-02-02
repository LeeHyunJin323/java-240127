package j11_상속.factory;

public class FactoryMain1 {

	public static void main(String[] args) {
		
		/*
		 * 삼성팩토리 배열(크기: 5)
		 * 1공장 ~ 5공장
		 * 
		 * 엘지팩토리 배열 ( 크기 : 3)
		 * 1공장 ~ 5공장
		 * 
		 *삼성공장가동
		 *1공장 가동합니다
		 *...
		 *5공장을 가동합니다.
		 *
		 *상섬공장중지
		 *1공장을 중지합니다.
		 *...
		 *5공장을 중지합니다.
		 *
		 *엘지공장가동
		 *....
		 *
		 *엘지공장 중지
		 *...
		 *
		 */
		SamsungFactory[] samsung = new SamsungFactory [5];
		LGFactory[] lg = new LGFactory [3];
		
		samsung[0] = new SamsungFactory(1);
		samsung[1] = new SamsungFactory(2);
		samsung[2] = new SamsungFactory(3);
		samsung[3] = new SamsungFactory(4);
		samsung[4] = new SamsungFactory(5);
		
		lg[0] = new LGFactory(1);
		lg[1] = new LGFactory(2);
		lg[2] = new LGFactory(3);
		
		for(int i =0 ; i< samsung.length; i++)
		{
			samsung[i].start();
		}
	
		for(int i =0 ; i< samsung.length; i++)
		{
			samsung[i].stop();
		}
		
		for(int i =0 ; i< lg.length; i++)
		{
			lg[i].start();
		}
		
		for(int i =0 ; i< lg.length; i++)
		{
			lg[i].stop();
		}
	}

}
