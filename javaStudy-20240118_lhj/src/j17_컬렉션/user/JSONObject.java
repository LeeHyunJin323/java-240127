package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {
		

		/*
		 * {
		 * 
		 * "no" : 1,
		 * "message" : "1page list",
		 * "data" : [ 
		 * 		 *             {
		 *                   "name" : "홍길동"
		 *                    "주소" : "부산광역시 서구",
		 *                    "연락처" : "010-7731-0557",
		 *                    "성별" : 0
		 *                    }
		 *             {
		 *                   "name" : "홍길서"
		 *                    "주소" : "부산광역시 서구",
		 *                    "연락처" : "010-7731-0557",
		 *                    "성별" : 1
		 *                    }
		 *                    ]
		 *                    }
		 *                  
		 */
		
		Map<String,Object> map2 = new HashMap<String, Object>();
		List<Map<String ,Object>> list = new ArrayList<Map<String ,Object>>();
		
		Map<String, Object> map = new HashMap<String,Object>();
		Map<String, Object> map1 = new HashMap<String,Object>();

		map.put("name", "홍길동");
		map.put("주소", "부산광역시 서구");
		map.put("연락처", "010-1234-5678");
		map.put("성별", 0);
		
		map1.put("name", "홍길서");
		map1.put("주소", "부산광역시 서구");
		map1.put("연락처", "011-1234-5678");
		map1.put("성별", 1);
		list.add(map);
		list.add(map1);
	
		map2.put("no", 1);
		map2.put("message", "1page list");
		map2.put("data", list);
		
		System.out.println(map2);
	}

}
