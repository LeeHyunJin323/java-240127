package j19_익명클래스.람다식;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {

		/*
		 * 람다식 패키지 안에 MathTest라는 인터페이스 만들기 test메소드 만들기
		 * 
		 * 테스트 메소드에 정수인 점수 던지기 A학점 or B학점 or 계산불가를 리턴
		 * 
		 * 
		 */


		// 매개변수가 하나일 시 소괄호 생략가능
		MathTest math5 = v1 -> {
			if (v1 <= 0 || v1 >= 100) {
				return "계산불가";
			} else if (v1 > 89) {
				System.out.println("A학점 입니다.");

			} else if (v1 > 79) {
				return "B학점 입니다.";

			}

			else if (v1 > 69) {
				return "C학점 입니다.";

			}

			else if (v1 >= 59) {
				return "D학점 입니다.";

			}

			else {
				return "F학점 입니다.";

			}
			return null;

		};
		System.out.println(math5.test(35));

	}
}
