package j14_lombok;


import lombok.Data;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;


//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data   // setter, getter , equlals , toString 다 넣어넣은거

public class Student {

	
	private int studentCode;
	private final String name;
	private int studentYear;
	@NonNull // age가 null이 되면 안된다
	private int age;
	

}
