package j13_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {
	//name1 과 name2는 100번지를 가르킴	"홍길동" 100 번지 
//		name3 객체 생성한 홍길동은 200 번지에 홍길동을 만들고
//		name4 = name3을 하면 200 name4도 200번지를 가르킴
		
//		== 은 주소를 비교
//       equals는 값만 비교
	
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		String name4 = name3;
		
		//주소 비교
		System.out.println(name1 == name2);
		System.out.println(name1== name3);
		System.out.println(name2 == name3);
		System.out.println(name3 == name4);
		
		//문자열 비교
		System.out.println("name1.equals(name2): "+ name1.equals(name2));
		System.out.println("name1.equals(name3): "+ name1.equals(name3));
		System.out.println("name3.equals(name4): "+ name3.equals(name4));
		
		
		

	}

}
