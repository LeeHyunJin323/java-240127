package j07_반복;

public class Continue1 {

	public static void main(String[] args) {
		   
		//0부터 9까지 출력하는 반복문 작성
//		
//		for (int i = 0; i<10; i++)
//		{
//			if(i%2 == 0)
//			{
//				//System.out.println("짝수");
//				continue;
//			}
//			System.out.println(i);
//
//			
//		}
		
		
		//while은 안되나?
//		int i = 0;
//		
//		while(i<10)
//		{
//			if(i%2 == 0)
//			{
//		        i++;   // 이거 없으면 continue로 조건으로 다시 가는데 i++이 없게 된다면 짝수가 나와서 계속 돈다.
//				continue;
//			}
//			System.out.println(i);
//		      i++;
//		}
		
		
		/*
		 * continue를 사용하여 1부터 129까지의 수 중 홀수의 합을 구하시오
		 
		 */
//		int sum = 0;
//	 for(int i =0; i<130; i++)
//	 {
//		 if(i%2 == 0)
//		 {
//			 continue;
//		 }
//		 System.out.println(i);
//		 sum += i;
//		 
//		 
//	 }
//	 System.out.println(sum);
		
		int i = 0;
		int sum = 0;
		while(i<130)
		{
			if(i%2 == 0)
			{
				i++;
				continue;
				
			}
			sum += i;
			
			i++;
		
		}
		System.out.println("홀수의 합"+sum);

	}

}
