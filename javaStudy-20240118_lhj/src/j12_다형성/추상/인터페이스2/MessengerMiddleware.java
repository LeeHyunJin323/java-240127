package j12_다형성.추상.인터페이스2;

public class MessengerMiddleware {
 //메신저를 받는 생성자 생성
	
	private Messenger messenger;

	
	// private인 객체를 사용하기 위해 생성자에 담아줌
	
	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessage() {
		messenger.send();
	}
	
	public void receiveMesseage( ) {
	messenger.receive();
	}
	
	public void runAddOns() {
		if(messenger instanceof KakaoTalk) {
			((KakaoTalk)messenger).sendPresent(); // 캐스팅을 사용하여 메신저에서 안되는 카카오톡 메소드 사용
		}else if(messenger instanceof Instagram)
		{
			((Instagram)messenger).sendStory();
		}
		
	}
	
}
