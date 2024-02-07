package j12_다형성.추상.인터페이스2;

public class KakaoTalk implements Messenger{
	
	public void send() {
		System.out.println("카카오톡에서 메신저를 보냅니다.");
	}
	public void receive() {
		
		System.out.println("카카오톡에서 메신저를 받습니다.");
	}
	// 메신저라는 인터페이스를 만들고 그 메신저라는 인터페이스를 카카오톡에 사용 
	// 다른곳에서도 Messenger.으로 사용해서 모든 메세지 인터페이스를 Messenger로 통합하기 위해서 인듯?
	
	
	public void sendPresent() {
		System.out.println("카카오톡 선물기능");
	}
	// 선물기능은 여기서 구현

}
