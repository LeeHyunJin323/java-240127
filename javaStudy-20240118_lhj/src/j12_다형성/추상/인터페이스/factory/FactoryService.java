package j12_다형성.추상.인터페이스.factory;

public class FactoryService {

	private Factory factory;
	
	
	
	public void fatoryStart() {
		factory.start();
	}
	public void fatorystop() {
		factory.stop();
	}
}
