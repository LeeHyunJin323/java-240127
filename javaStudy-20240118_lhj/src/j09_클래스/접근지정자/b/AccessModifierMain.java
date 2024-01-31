package j09_클래스.접근지정자.b;

import j09_클래스.접근지정자.TestA_1;
import j09_클래스.접근지정자.TestA_2;

public class AccessModifierMain {

	public static void main(String[] args) {
		TestA_2 testA_2 = new TestA_2();
		
		testA_2.TestA2();
		TestA_1 testA11 = new TestA_1();
		
		//testA11.TestA1();
		
		//System.out.println(testB.tb);
		TestB testB = new TestB();
		System.out.println(testB.getTb());

	}

}

