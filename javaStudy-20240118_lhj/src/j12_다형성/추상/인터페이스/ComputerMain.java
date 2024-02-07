package j12_다형성.추상.인터페이스;

public class ComputerMain {

	public static void main(String[] args) {
		Bluetooth bluetooth = new Mouse();
		Moniter monitor = new Moniter();
		Computer computer = new Computer(monitor);
		computer.setBluetooth(bluetooth);
		
		computer.powerOn();
		
		System.out.println();
		computer.powerOff();

	}

}
