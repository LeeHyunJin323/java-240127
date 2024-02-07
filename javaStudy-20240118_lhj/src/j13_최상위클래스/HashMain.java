package j13_최상위클래스;

public class HashMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(20230001, "홍길동");
		Student s2 = new Student(20230002, "홍길동");
		Student s3 = new Student(20230003, "최연호");
		Student s4 = new Student(20230001, "홍길동");
		
		System.out.println(s1.hashCode());  
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode()); 
		
		
		/*
		 * 만약에....................
		 * 바나나라는 클래스를 만들었습니다.
		 * 내가 내용말고 기본 세팅을 풀 세팅으로 만든다 뭐가 필요합니까??
		 * 1. @기본 생성자 , 필수 생성자, 전체생성자
		 * 2. @겟터 , 셋터
		 * 3. @toString
		 * 4. @equals
		 * 5. @hash
		 * 풀패키지
		 * 컴파일할때 @보고 생성
		 * @바나나를 받으면 사과를 리턴하는 기능 -> 이런건 외워야함
		 * 
		 *  만약 회원가입을 한다 치면 비밀번호에 대문자 , 소문자 , @#$를 써야하는데 123만 입력했따 그러면
		 *  그 메소드를 만들어놓은걸 젤 위에 나둠 @로 가져와서
		 */
		
		
		
		

	}

}
