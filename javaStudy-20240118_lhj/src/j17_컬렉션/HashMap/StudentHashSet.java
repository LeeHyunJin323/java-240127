package j17_컬렉션.HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import j15_스태틱.Student;

public class StudentHashSet {
	
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
	
	HashSet<Student> studentSet = new HashSet<Student>();
	
	studentSet.addAll(Arrays.asList(students));
	
	//System.out.println(studentSet);
	
    Scanner sc = new Scanner(System.in);

    // 사용자가 선택한 메뉴 번호 입력
    System.out.println("원하는 메뉴를 선택하시오.");
    System.out.println("1. 학생 전체 조회");
    System.out.println("2. 삭제");
    int number = sc.nextInt();

    // 메뉴에 따라 동작 수행
    if (number == 1) {
        // 학생 전체 조회
        for (Student student : studentSet) {
            System.out.println("학번: " + student.getStudentCode() + " 이름: " + student.getName());
        }
    } else if (number == 2) {
        // 학생 삭제
        System.out.print("삭제할 학생의 이름을 입력하시오:");
        sc.nextLine(); // 개행 문자 소비
        String removeName = sc.nextLine();
        System.out.print("학번을 입력하시오 :");
        int removeNumber = sc.nextInt();

        // Iterator를 사용하여 안전하게 요소 제거
        boolean removed = false;
        for (Student student : studentSet) {
            if (removeName.equals(student.getName()) && removeNumber == student.getStudentCode()) {
                studentSet.remove(student);
                removed = true;
                break; // 제거 후 반복문 종료
            }
        }

        // 제거 여부에 따른 메시지 출력
        if (removed) {
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }
    }
	}
}
	
	/*
	 * student 1,2,3,4,5를 students라는 배열에 넣고
	 * 
	 * students 배열을 studentSet이라는 set에 넣기
	 * 
	 * 원하시는 메뉴를 선택하시오
	 * 1. 학생 전체 조회
	 * 2. 삭제
	 * 
	 * 
	 * 1선택
	 * 학번: ~ 이름 : ~
	 * 
	 *  2 선택
	 *  삭제할 학생의 이름을 입력하시오: 홍길서
	 *  학번을 입력하시오 : 20240002
	 *  삭제되었습니다.
	 *  
	 *  학번 잘못 입력시 학번이 올바르지 않습니다. 삭제x
	 * 
	 */


