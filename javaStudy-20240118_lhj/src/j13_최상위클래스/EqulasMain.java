package j13_최상위클래스;

public class EqulasMain {

	public static void main(String[] args) {
		Student s1 = new Student(20230001, "홍길동");
		Student s2 = new Student(20230001, "홍길동");
		Student s3 = new Student(20230002, "홍길서");
		Student s4 = new Student(20230002, "홍길동");
		

//		String에는 equals가 값이 같은경우 true로 리턴하라고 정의가 되있음
//		그런데 지금 Student의 경우 내가 만든 객체임 -> 현재 equals에 대한 정의가 안되어있어서 false가 나옴 
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));

	}

}
