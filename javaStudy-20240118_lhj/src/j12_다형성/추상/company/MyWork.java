package j12_다형성.추상.company;

public abstract class MyWork extends Boss{
	public void work1() {
		System.out.println("일하자1");
	}
	public void work2() {
		System.out.println("일하자2");
	}
	
	
	// 추상메소드 받다가 work3은 못하는 일이 생기면 클래스하나 더 생성하면서 
	// MyWork가 다 수행못했기때문에 abstract를 써서 추상클래스로 만들어줌 -> 아마 Boss를 받았는데 
	// 추상메소드를 다 정의 못해서 그런듯
	

	
	
	

}
