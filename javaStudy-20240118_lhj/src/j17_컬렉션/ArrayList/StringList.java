package j17_컬렉션.ArrayList;

import java.util.ArrayList;

public class StringList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		// 원하는 위치에 값 추가
		list.add(1, "css"); // 1번 인덱스에 값을 넣고 기존의 값은 뒤로 밀림
		
		// 리스트의 크기
		System.out.println(list.size());
		
		System.out.println(list);
		
		// 리스트에 해당 인덱스로 값 찾기
		System.out.println(list.get(2));
		

		// 리스트에서 값을 통해 인덱스 찾기
		int findindex  = list.indexOf("python");
		System.out.println("python 위치 : " + findindex);
		
		
		
	}

}
