package j15_스태틱.싱글톤;

import j14_lombok.Computer;

/*
 * 싱글톤(Singleton)
 * :유일한 객체를 만들어서 공유하는 생성패턴
 * 1. 생성자의 접근지정자는 private이다.
 * 2. 자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을 
 *    가진 스태틱 변수가 필요하다.
 * 3. instance라는 변수를 리턴(공유)해줄  getInstance라는 스태틱 메소드가 
 *     필요하다.
 *   
 *  
 *  
 */
public class KIA {
	
//	private KIA() {
//		
//	}
//	
	private static KIA instance;  // instance라는 스태틱 변수
	private Car[] carArray; 
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20240000;
	} // 모델을 받을 거임
	
	public static KIA getInstatnce() { // getInstance 라는 스태틱 메소드
		if(instance == null) { // 스태틱변수가 null이라면 객체 생성 아니라면 그냥 리턴
			instance = new KIA();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode; 
		String company = getClass().getSimpleName(); // 겟심플 -> 클래스명만
		//클래스명을 받기 때문에 KIA 리턴
//		Car car = new Car(carNumber, company,model);
		
		// 빌더로 넣기
		
		Car car = Car.builder()
				.carNumber(carNumber)
				.company(company)
				.model(model)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		
		return null;
		
	}
	
	
	private boolean addCar(Car car) {
		for(int i = 0; i< carArray.length; i++)
		{
			if(carArray[i] == null) { // 첫번째 배열이 null이라면 주차
				carArray[i] = car;
				System.out.println("주차완료");
				return true;
			}
		}
		System.out.println("만차입니다.");
		return false;
	}

}
