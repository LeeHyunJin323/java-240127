package j17_컬렉션.ArrayList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		Student student5 = new Student("홍길중");

		Student[] students = new Student[5];
		
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		
//		for(int i = 0; i<students.length; i++)
//		{
//			System.out.println(students[i]);
//		}
//	
	
		

		
		ArrayList<Student> sutdentList = new ArrayList<Student>();
		
		List<Student> aslist = Arrays.asList(students);
		sutdentList.addAll(Arrays.asList(students));
		
		System.out.println(sutdentList);
		
		// students라는 배열을 asList라는 리스트로 변경

		
		for(Student str : sutdentList) {
			System.out.println("학번 : " + str.getStudentCode()+" 이름 :" + str.getName());
		}
		
		/*
		 * 이름이 홍길북인 객체를 찾아서
		 * 학번: 이름 : 출력 하고
		 * 객체 삭제
		 */

		for(Student str : sutdentList)
		{
			if(str.getName() == "홍길북")
			{
				System.out.println("학번 : " + str.getStudentCode()+" 이름 :" + str.getName());
				sutdentList.remove(str);
			}
		}

		//사라졌는지 확인
		for(Student str : sutdentList) {
			System.out.println("학번 : " + str.getStudentCode()+" 이름 :" + str.getName());
		}
		
		
		
		/*
		 * student1 , 2, 3 , 4 , 5를 가지는 students라는 배열을 만드시오
		 * 
		 * 그리고
		 * studentList라는 리스트를 만들고
		 * 이 리스트에 students를 추가하시오 addAll 
		 */
	}

}
