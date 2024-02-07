package j13_최상위클래스;

import java.util.Objects;

public class Student {

	private int studentCode;
	private String name;
	
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}

	public Student(int studentCode, String name) {
		super();
		this.studentCode = studentCode;
		this.name = name;
	}
	
	 @Override
	public int hashCode() {
		return Objects.hash(name, studentCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentCode == other.studentCode;
	}
	 
	 
	
}
