package j10_배열;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		int [] numbers1 = {1,2,3,4,5};
		numbers1[0]=5;
		
		int[] numbers5 = Arrays.copyOfRange(numbers1, 1, 3);
		
		int index = Arrays.binarySearch(numbers1, 5);
		System.out.println("찾은 인덱스 :"+ index);
		
		
		

	}

}
