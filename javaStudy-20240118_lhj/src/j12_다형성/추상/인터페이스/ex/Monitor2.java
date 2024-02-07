package j12_다형성.추상.인터페이스.ex;

public class Monitor2 implements HDMI2{
	// 모니터에서 추상클래스를 정의
	 // 모니터에 먼저 연결 해야하니깐 모니터에 인터페이스 구현
	public void connect() {
		System.out.println("HDMI2를 통해 모니터를 연결합니다.");
	}

	public void disconnect() {
		System.out.println("HDMI2를 통해 모니터를 해제 합니다.");
	}
}
