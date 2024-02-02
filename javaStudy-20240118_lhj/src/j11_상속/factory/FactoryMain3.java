package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		SamsungFactory samsung = new SamsungFactory(1);
		Factory sfactory = samsung;
		SamsungFactory sumsung2 = (SamsungFactory)sfactory;
		
		
//		Factory factory = new Factory(1);
//		LGFactory lgFactory = (LGFactory)factory;
		// 근본 주소로 내려오는건 가능, 부모주소에서 자식주소 못 내려옴

		
	}

}
