package j12_다형성.추상.인터페이스.ex;


public class Computer2 {

	private HDMI2 hdmi2;
	
	public Computer2(HDMI2 hdmi2) {
		this.hdmi2 = hdmi2;
	}
	
	// hdmi2 추상클래스를 모니터에서 정의 해주고 
	// 컴퓨터와 모니터를 hdmi로 연결해줘야하니깐 hdmi 객체 생성
	// hmdi.connet 를 하면 monitor에서 구현을 했기때문에 HDMI 를 통해 연결 한다를 사용가능.
	
	
	
	public void powerOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
		connetdisplay();
	}
	public void powerOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
		disconnetdisplay();
	}
	
	public void connetdisplay() {
		System.out.println(":출력장치를 연결합니다.");
		hdmi2.connect();
	}
	
	public void disconnetdisplay() {
		System.out.println("출력장치를  해제 합니다.");
		hdmi2.disconnect();
	}
}
