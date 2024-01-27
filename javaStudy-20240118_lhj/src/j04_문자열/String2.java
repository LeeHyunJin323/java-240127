package j04_문자열;

public class String2 {

	public static void main(String[] args) {
		String address = "부산광역시 서구 부민동";
		System.out.println(address.replace(' ', '-'));
		// 스페이스바 부분을 - 으로 변경
		
		String address2 = "부산광역시 연제구 연산동";
		String replaceAddress = address2.replaceAll(" 연", " 홍");
		
		System.out.println(replaceAddress);
		
	/*
	 * 01033004698
	 * -> 비밀번호 확인완료 11개일때 ok
	 * 
	 * 010-3300-4698    
	 * -> 01033004698 번호 저장완료 
	 * 
	 * 010/3300/4698
	 * -> 010330046698 번호 저장 완료
	 * 
	 * 010-3300-466987  개수가 안맞을때
	 * -> 비밀번호가 옳바르지 않습니다.
	 * 
	 * 삼항연산자, replace 등을 사용
	 * 
	 */
		
		
		
		String phoneNumber = "010-3300-4455";
		
//		3번쨰 , 후 4번쨰
		int phoneNumberCount = phoneNumber.length();
//		System.out.println(phoneNumber.replace(' ', '-'));
		String pHoneNumber2 = phoneNumber.replace("-", "");
		
		int pHoneNumberCount2 = phoneNumber.replace("-", "").length();
		String pHoneNumber3 = phoneNumber.replace("/", "");
		int pHoneNumberCount3 = phoneNumber.replace("/", "").length();
		
		String result;
		// 맞다면 010-3300-4698로 변경해서 출력후 다시 비밀번호 저장완료 출력
		
		result = phoneNumberCount == 11 ? "번호 확인완료"
				: pHoneNumberCount2 == 11 || pHoneNumberCount3 == 11 ? pHoneNumber2 +"번호 저장 완료"
						: "비밀번호가 옳바르지 않습니다.";
		
		System.out.println(result);
		
		// 13자리가 아니면 올바르지 않다 , 13자리면 후 /과 공백 ""로 변경
		
		
		String phoneNumbers2 = "010/3300/4698 , 010/1234/5678";
		// 011-3300-4698/011-1234-5678
	
		
		String phoneNumbers3 = phoneNumbers2.replaceAll("/", "-").replaceAll("010", "011").replaceAll(",", "/");
		
		System.out.println(phoneNumbers3);
		
		
//		"010/3300/4698 , 010/1234/5678";
		String number = "010/3300/4698 , 010/1234/5678";
		
		String number2 = number.replaceAll("/","-").replaceAll("010","011").replaceAll(" , ","/");
		System.out.println(number2);
		

	 

				 
	}

}
