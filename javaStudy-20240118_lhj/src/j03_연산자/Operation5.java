package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {
		String str = "안";
		System.out.println(str.length());
		
		
		String result;
		String pw = "Qweasddgd";
		
		int pwCount = pw.length();
		
		result = (pwCount == 0)?"비밀번호를 입력하세요"
				:(pwCount >= 8 &&pwCount <= 16)?"비밀번호 확인되어습니다."
				:"비밀번호가 8~16자리가 되어야함."; // pw가 8보다 크면서 16보다 커야하니깐 and
		        System.out.println(result);  
		        
		        
		        // 복합대입연산자 +=
		     
		/*
		 * int num = 5;
		 * System.out.println
		 */
		
		
		/*
		 * pw
		 * 비밀번호가 8~16자리가 되어야함.
		 * 8~16 자리를 충족하면 비밀번호가 확인되어습니다.
		 * 비밀번호자릿수를 맞춰주세요
		 * 비밀번호 미작성 시 비밀번호를 입력하세요.
		 */

		        
		     String name = "홍길동"; // String은 클래스 자료형 -> 기능(함수)들을 제공해줌 ex) length()
		     int num2 =123 ;
		     
		     
		     
		    
	}

}
