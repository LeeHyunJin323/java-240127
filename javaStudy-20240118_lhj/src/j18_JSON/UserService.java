package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import j17_컬렉션.ArrayList.User;
import j17_컬렉션.ArrayList.UserArrayList;
import lombok.Data;

@Data
public class UserService {


	// 리턴은 유저 void이런거 ㅇㅇ
	public static j18_JSON.User createUser() {
		//user 객체(내 정보) 만들고 리턴

           List<String> list = new ArrayList<String>();
           list.addAll(Arrays.asList(new String[] {"축구","농구","야구","골프","턱걸이"}));
           //User 클래스에서 builder
           j18_JSON.User user = j18_JSON.User.builder()  
        		   .username("gildong")
        		   .password("1234")
        		   .email("gildong@naver.com")
        		   .userCode(0)
        		   .address("부산광역시 진구")
        		   .phone("010-1234-5678")
        		   .hobby(null)
        		   .build();
           
           return user;

		
		
		
	}
}
