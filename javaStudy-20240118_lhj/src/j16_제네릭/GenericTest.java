package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest <T>{

	private int number;
//	private int data;
	
	
	private T data;
	
}
