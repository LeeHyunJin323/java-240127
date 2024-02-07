package j12_다형성.추상.인터페이스2;

public class Instagram implements Messenger {
	
	public void send() {
		System.out.println("인스타그램에서 메신저를 보냅니다.");
	}
	
	public void receive() {
		System.out.println("인스타그램에서 메신저를 받습니다.");
	}
	
	// 위는 인터페이스로 묶인걸로 구현
	
	
	
	public void sendStory() {
		System.out.println("인스타그램에서 스토리를 보냅니다.");
	} 
	
	// 여긴 인스타그램의 개인 기능  
	// 여기서 구현

}
