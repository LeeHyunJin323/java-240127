package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Builder;
import lombok.Data;
@Data
public class UserArrayList {

	private List<User> userList; // 리스트 생성
	//List는 인터페이스임 그래서 new 해서 생성이 안됨 그래서 ArrayList일때 new로 생성함
	private Scanner sc;
	
	public UserArrayList() { // 기본생성자
		userList = new ArrayList<User>();  // userList는 ArrayList<User> 의 형태로 선언 
		// UserArrayList()가 생성될 때 userList가 초기화 됨

		sc = new Scanner(System.in);
	}
	
	
	
	private void addUser() {
		String userName = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디 :");
		userName = sc.nextLine();
		System.out.println("비밀번호 :");
		password = sc.nextLine();
		System.out.println("이름 :");
		name = sc.nextLine();
		System.out.println("이메일 :");
		email = sc.nextLine();
		
		//User user = new User(userName,password,name,email);
		
		//set으로 삽입방법   @Data로 인한 setter가 생성됐기 떄문에 이렇게 삽입이 가능
//	    User user = new User();
//	    user.setUsername(userName);
//	    user.setPassword(password);
//	    user.setName(name);
//	    user.setEmail(email);
		
		// 빌더 만들기 User user 클래스명.builder() 빌더는 스태틱 지금 어노테이션으로 빌더가 생겨서 User 클래스명.빌더로 사용이 가능
		User user = User.builder()
				.username(userName)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user); // userList에 user 빌더 생성한거 삽입

		
	}
	
	private void printUserList() { 
		//user의 값 뭐 getName이런걸로 아이디값 가져올려고 data달아둠
		for(User user : userList) {
			System.out.println("아이디\t\t >" + user.getUsername());
			System.out.println("비밀번호\t\t >" + user.getPassword());
			System.out.println("이름\t\t >" + user.getName());
			System.out.println("이메일\t\t >" + user.getEmail());
		}
		
	}
	private void RemoveUser() {
		String userName = null;
		String password = null;
		System.out.print("아이디 :");
		userName = sc.nextLine();
		
		for(User user : userList) {
		if(user.getUsername().equals(userName)) {
			
			System.out.print("비밀번호 :");
			password = sc.nextLine();
			if(user.getPassword().equals(password)) {
				userList.remove(user);
				System.out.println("유저 삭제 완료");
			}else {
				System.out.println("비밀번호가 올바르지 않습니다.");
			}
			return;  // if 에 걸리면 리턴 안되면 바로 존재핮 않는 아이디
					
		}
		
		
		}
		System.out.println("존재하지 않는 아이디 입니다.");
		
	
	}
//	 * 
//	 * 3이면 
//	 * 
//	 * 아이디를 입력하시오 : gildong
//	 * 비밀번호를 입력하시오 :1234
//	 * 유저가 삭제되었습니다
//	 * 
//	 * 아이디르 입력하시오 : gildong
//	 * 비밀번호를 입력하시오 :12345
//	 * 비밀번호가 올바르지 않습니다.
//	 * 
//	 * 
//	 * 아이디를 입력하시오 : gildong2
//	 * 존재하지 않는 아이디입니다.
	
	
	
	public static void main(String[] args) {
		
		UserArrayList userArrayList = new UserArrayList(); //객체를 생성해줘야 sc사용가능한 상태
		
		while(true)
		{
			String select = null;
			
			System.out.println("[사용자 관리 프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("메뉴 선택 >");
			
			select = userArrayList.getSc().nextLine(); 
			
			//private Scanner sc 를 객체. 메소드로 사용
			
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printUserList();
			}else if(select.equals("3")) {
				userArrayList.RemoveUser();
			}
		}
		

		
		
		
		/*
		 * 
		 * [사용자 관리 프로그램]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 * 메뉴 선택 > 2
		 * 
		 * 
		 * 메뉴선택 1
		 * 
		 * 아이디 : gildong
		 * 비밀번호 : 1234
		 * 이름: 홍길동
		 * 이메일 : gildong@naver.com
		 * 
		 * 
		 * 2 
		 * 
		 * 아이디 > gildong
		 * 비밀번호 > 1234
		 * 이름 : 홍길동
		 * 이메일 gildong@navercom
		 * 
		 * 
		 * 3이면 
		 * 
		 * 아이디를 입력하시오 : gildong
		 * 비밀번호를 입력하시오 :1234
		 * 유저가 삭제되었습니다
		 * 
		 * 아이디르 입력하시오 : gildong
		 * 비밀번호를 입력하시오 :12345
		 * 비밀번호가 올바르지 않습니다.
		 * 
		 * 
		 * 아이디를 입력하시오 : gildong2
		 * 존재하지 않는 아이디입니다.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		ArrayList<User> list = new ArrayList<User>();
		
//		 * 메뉴선택 1
//		 * 
//		 * 아이디 : gildong
//		 * 비밀번호 : 1234
//		 * 이름: 홍길동
//		 * 이메일 : gildong@naver.com
//		 * 
		

//		
//		String select = null;
//		String ID = null;
//		String PW = null;
//		String name = null;
//		String email = null;
//		
//		String n = null;
//		
//		select = sc.nextLine();
//		if(select.equals("1")) {
//		
//			System.out.print("아이디 :");
//			ID = sc.nextLine();
//			list.add(ID);
//			
//			System.out.print("비밀번호 :");
//			PW = sc.nextLine();
//			list.add(PW);
//			
//			System.out.print("이름 : ");
//			name = sc.nextLine();
//			list.add(name);
//			
//			System.out.println("이메일 :");
//			email = sc.nextLine();
//			list.add(email);
//			
//		}
//		
//		System.out.println(list);
		// 1번일때 리스트에 추가 .add
		
		

	}

}
