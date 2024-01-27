package j06_조건;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		String result = null;
		x = sc.nextInt();

		y = sc.nextInt();
		if (x < 0 && y < 0) {
			result = "3";
		} else if (x > 0 && y > 0) {
			result = "1";
		} else if (x > 0 && y < 0) {
			result = "4";
		} else if (x < 0 && y > 0) {
			result = "2";
		} else {
			result = "4";
		}

		System.out.println(result);
	}

}
