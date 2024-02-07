package j12_다형성.추상.인터페이스.factory;

public class FactoryMain {

	public static void main(String[] args) {
	SamsungFactory samsungfactory = new SamsungFactory();
	LGFactory lgfactory = new LGFactory();
	
	FactoryService factoryService = new FactoryService();
	
	
	factoryService.fatoryStart();
	System.out.println();
	factoryService.fatorystop();
	}

}
