package j12_다형성.추상.빌딩;

public abstract class Buliding {

	public abstract void fire();
	public abstract void elevator();
	public abstract void stairs();
	
	
	
	public void restroom(int num) {
		System.out.println("화장실 개수 : "+num);
	}

}
