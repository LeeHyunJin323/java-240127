package j05_입력;

import java.util.Scanner;

public class input3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println(scanner.next());
		String str;
		System.out.println("내용을 입력하시오: ");
		System.out.println(scanner.next());
		str = scanner.nextLine();
		System.out.println("내용 :" + str);

	}

}
