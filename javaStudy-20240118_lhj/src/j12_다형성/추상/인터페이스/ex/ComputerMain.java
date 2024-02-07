package j12_다형성.추상.인터페이스.ex;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor2 monitor = new Monitor2();
		Computer2 computer2 = new Computer2(monitor);
		
		
		computer2.powerOn();
		System.out.println();
		computer2.powerOff();

	}

}
