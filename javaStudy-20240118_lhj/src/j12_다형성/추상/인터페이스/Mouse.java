package j12_다형성.추상.인터페이스;

public class Mouse implements HDMI, Bluetooth{

	public void wireless() {
		System.out.println("무선연결");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("무선연결해제");
	}
	
	
	public void connect() {
		System.out.println("마우스 유선 연결");
	} 
	
	
	public void disConnect() {
		System.out.println("마우스 무선 연결");
	}



}
