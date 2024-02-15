package j17_컬렉션.HashSet;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer , String> strMap = new HashMap<Integer,String>();
		
//		strMap.put(1, "java");
//		strMap.put(1, "java");
//		strMap.put(1, "java"); 중복 안됨
		strMap.put(1, "java");
		strMap.put(1, "java2");
		strMap.put(1, "java3"); // 키값이 같으면 마지막만 들어감
		
		strMap.put(10, "java1");
		strMap.put(20, "java1");
		strMap.put(30, "java1");
		strMap.put(40, "java1"); 
		// Map은 순서가 없고 키의 중복은 허용하지않고
		// 값(value)의 중복은 허용한다.
		
		System.out.println(strMap);
	
		// Map은 foreach가 안됨
		
//		for(Integer key : strMap) {
//			
//		}
		
		//순서가 없으면 아이터레이터 써야함
		// 중복이 되지 않는 키를 사용할거임
		
//		Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화한 것
//
//		hasNext() : 읽어올 요소가 남아있는지 확인하는 메서드, 요소가 있으면 true, 없으면 false
//
//		next() : 다음 데이터를 반환
//
//		remove() : next()로 읽어온 요소를 삭제
		
		System.out.println(strMap.keySet()); // 키값만 가져옴
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		
		while(irKey.hasNext())
		{
			System.out.println(strMap.get(irKey.next()));
		}
		
		System.out.println(strMap.get(1)); // 키값 넣으면  밸류값 나옴

		
//		
//		System.out.println(strMap.containsKey(20));
//		System.out.println(strMap.containsValue("java3"));
//		System.out.println(strMap.containsValue("java7"));
	}

}
