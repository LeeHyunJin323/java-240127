package j11_상속.factory;

public class SamsungFactory extends Factory {

	
	// 삼성생성자를 호출 하면 팩토리 생성자가 호출됨
	
	
	//자식한테 받아서 부모한테 던져
	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	}


	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("삼성");
		super.stop();
		
	}
	public void produceSmartPhone() {
		System.out.println("스마트폰을 생상합니다.");
	}
  
	
}
