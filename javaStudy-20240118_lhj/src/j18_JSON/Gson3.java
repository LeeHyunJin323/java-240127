package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson3 {

	public static void main(String[] args) {
		
		User user = UserService.createUser(); // 생성도 되고 값도 다 들어감
		// createUser을 사용해서 값이 다들어간걸 만들어냄
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// Map -> JSON
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cpde", 1);
		map.put("message", "json 형변환 테스트");
		map.put("data", user);
		
		System.out.println(map);
		
		// 맵을 json으로 변경
		String mapJson = gson.toJson(map);
		System.out.println(mapJson);
		
		
		
		// JSON -> Map  
		Map<String, Object> mapObj = gson.fromJson(mapJson,Map.class);
		System.out.println(mapObj);
		
		
		
		
		
		
		// set으로 하면 따로따로 하나씩 뽑아내기 쉽다.
		

	}

}
