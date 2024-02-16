package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		User user = UserService.createUser(); // 생성도 되고 값도 다 들어감
		// createUser을 사용해서 값이 다들어간걸 만들어냄
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		// 여기선 .getAddress 가 안됨 String으로 변경된 상태라 
		// .getAddress 를 해서 주소를 뽑고싶다면 객체로 변경해줘야함
		
		// 객체로 변경
		User userObj = gson.fromJson(userJson , User.class);
		System.out.println(userObj.getAddress()); // 원하는 값 뽑기
		

	}

}