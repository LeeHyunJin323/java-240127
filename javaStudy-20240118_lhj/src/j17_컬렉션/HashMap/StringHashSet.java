package j17_컬렉션.HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java");
		set.add("java");
		//여러개 같은 거 넣어도 중복 xx
		
		set.add("python");
		set.add("2");
		set.add("1");
		set.add("C");
		set.add("html");
		
		System.out.println(set);
		Iterator<String> ir =  set.iterator();
//		System.out.println(ir.hasNext()); // 있습니다
//		System.out.println(ir.next()); // 1입니다.
//		System.out.println(ir.hasNext()); // 있습니다
//		System.out.println(ir.next()); // python
//		System.out.println(ir.hasNext()); // 있습니다
//		System.out.println(ir.next()); // 2입니다.
//		System.out.println(ir.hasNext()); // 있습니다
//		System.out.println(ir.next()); // java입니다.
		
		
		/*
		 * 반복문을 활용하여 
		 * set안에  2가 있는지 확인하고 
		 * 있으면 2를 출력
		 */
		

		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("2")) {
				System.out.println(str);
			}
		}
		
		
		System.out.println();
	
		for(String str : set) {
//			System.out.println(str);
			
//			if(str.equals("C"))
			if(str == "C")
			{
				System.out.println(str);
				set.remove(str);
				set.add("C++");
				
				break;
				// 브레이크가 없으면 오류가 나오는 이유
				//각각 노드라서 C를 찾은다음 갈곳을 잃어버림
			   
			}
			
		}
		System.out.println(set);

		
		
	}

}
