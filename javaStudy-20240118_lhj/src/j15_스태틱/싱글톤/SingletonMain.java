package j15_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		
//		KIA kia = new KIA();
		
		KIA kia = KIA.getInstatnce();
//		KIA kia2 = KIA.getInstatnce();
//		KIA kia3 = KIA.getInstatnce();
//		KIA kia4 = KIA.getInstatnce();

		System.out.println(kia);
//		System.out.println(kia2);
//		System.out.println(kia3);
//		System.out.println(kia4);
		
		System.out.println(kia.produceCar("k1"));
		System.out.println(kia.produceCar("k2"));
		System.out.println(kia.produceCar("k3"));
		System.out.println(kia.produceCar("k4"));
		System.out.println(kia.produceCar("k5"));
		System.out.println(kia.produceCar("k6"));
		System.out.println(kia.produceCar("k7"));
		System.out.println(kia.produceCar("k8"));
		System.out.println(kia.produceCar("k9"));
		System.out.println(kia.produceCar("k10"));
		System.out.println(kia.produceCar("k11"));

		
	}

}
