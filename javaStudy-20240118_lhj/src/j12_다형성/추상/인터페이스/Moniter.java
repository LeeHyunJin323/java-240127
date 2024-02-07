package j12_다형성.추상.인터페이스;

public class Moniter implements HDMI{
	
	public void connect() {
		System.out.println("HDMI를 통해 모니터를 연결합니다.");
	}
	
	
	public void disConnect() {
		System.out.println("HDMI에 모니터연결을 해제합니다.");
	}

}
