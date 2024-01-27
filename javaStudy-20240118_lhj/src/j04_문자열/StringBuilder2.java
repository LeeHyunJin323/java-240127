package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "김규원님, 김도형님, 김영필님, 김종관님";
		StringBuilder stringBuilder = new StringBuilder();
		
		/*
		 * subString을 활용하여 stringBuilder에 이름 넣기
		 * 결과물 : 김규원/김도형/김영필/김종관
		 * 
		 */
		
		//stringBuilder.append(names.substring(0,3));
		//System.out.println(stringBuilder);
		//stringBuilder.append(names.substring(6,9));
		//stringBuilder.append("/");
		//stringBuilder.append(names.substring(12,15));
		//stringBuilder.append("/");
		//stringBuilder.append(names.substring(18,21));
		//System.out.println(stringBuilder);

		int index = 0; 

		
		
		index = names.indexOf("님",index+1); // ,1부터 뒤에 있는 첫번째 님 찾음  (indexOf이니깐 님의 인덱스 번호인 3번환
		stringBuilder.append(names.substring(index -3 , index)); // -3 부터 index까지 김규원 append
		stringBuilder.append("/"); // 후 / append -> 김규원/
		index = names.indexOf("님",index+1); // 현재 인덱스 값 3  +1 하여 4부터의 님을 찾아냄
		stringBuilder.append(names.substring(index -3 , index)); 
		stringBuilder.append("/");
		index = names.indexOf("님",index+1);  
		stringBuilder.append(names.substring(index -3 , index)); 
		stringBuilder.append("/");
		index = names.indexOf("님",index+1);  
		stringBuilder.append(names.substring(index -3 , index)); 
		
		
//		String address = "부산 부민구 부민동";
//		int index2;
//		System.out.println(address.indexOf("부",1)); // 찾을 꺼 , 인덱스 1부터 시작해서 부를 찾아줌
	
		System.out.println(stringBuilder);

		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
//		
		
		int index2;
		index2 = stringBuilder2.indexOf("님"); // index2에 indexOf로 님의 인덱스를 담아줌
		stringBuilder2.delete(index2,index2 +3); // 님 부터 ,띄어쓰기 까지 삭제
		
		index2 = stringBuilder2.indexOf("님"); // 여기서는 왜 indexOf를 사용할때 다음 "님"을 찾기위해 , 4? 이런식으로 넣지 않았는가
		// 생각 했는데 "님"이 삭제되어서 다음 "님"은 김도형님 의 님이 될것이기 때문에 indexOf에 따로 다음 인덱스값을 넣어주지 않았다
		stringBuilder2.delete(index2,index2 +3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2,index2 +3);
		
		index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2,index2 +3);
		System.out.println(stringBuilder2);
		
	//System.out.println(stringBuilder2);
		//김규원김도형김영필김종관
		//님 , 만 짜름
		
		
//		int index2 = 0;
//		index2 = names.indexOf("님",index2+1); 
//		stringBuilder2.append(names.substring(index2 -3 , index2)); 
//		stringBuilder2.append("");
//		index2 = names.indexOf("님",index2+1); 
//		stringBuilder2.append(names.substring(index2 -3 , index2)); 
//		stringBuilder2.append("");
//		index2 = names.indexOf("님",index2+1); 
//		stringBuilder2.append(names.substring(index2 -3 , index2)); 
//		stringBuilder2.append("");
//		index2 = names.indexOf("님",index2+1); 
//		stringBuilder2.append(names.substring(index2 -3 , index2)); 
//		stringBuilder2.append("");
//		System.out.println(stringBuilder2);
		
	
		
		
		
		
		
		
		
		
	
		
		
	}

}
