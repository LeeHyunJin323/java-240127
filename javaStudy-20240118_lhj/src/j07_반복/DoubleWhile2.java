package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {

		int i = 1;
		int j = 0;
		while (i < 9) {
		   int dan = i+1;
			j = 1; // j를 1부터 다시 돌려야하니깐 j를 1로 초기화해서 X1부터 다시 시작
			
			System.out.println();
			System.out.println((i+1)+"단");
			System.out.println();
			while (j < 9) {
				int num = j+1;
				System.out.println((dan)+"X"+(num)+ "="+(num)*(dan));
				j++;
			}
			i++;
		}
		
	
	}

}
