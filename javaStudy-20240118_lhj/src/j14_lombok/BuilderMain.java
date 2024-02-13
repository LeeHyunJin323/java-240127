package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Builder builder = new Builder();
		
		
		Car car = builder.builder()
				.company("기아")
				.model("k5")
				.color("black")
				.build();
		
//		Car car = builder.builder()
//				.company("기아")
//				.model("k5")
//				.color("black")
//				.build();
		System.out.println(car);
	}

}
