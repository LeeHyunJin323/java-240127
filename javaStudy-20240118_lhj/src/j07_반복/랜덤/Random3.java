package j07_반복.랜덤;

public class Random3 {

	public static void main(String[] args) {
		
		/*
		 * 1~45까지의 수 중 5개를 랜덤으로 뽑고 그중 가장 큰 수를 
		 * 출력하시오
		 */
		
		int count = 0;
		int max = 0;
		
		while(true) {
			
			int rNum2 = (int)(Math.random() * 100);
			
			if(rNum2 < 46) {
				System.out.println("번호: " + rNum2);
				count++;
				if(max < rNum2) {
					max = rNum2;
					
				}
			}
			if (count == 5) break;
	
		
		}

		System.out.println("가장 큰 수는 :" + max);
		
	
	}
		
	

	}


