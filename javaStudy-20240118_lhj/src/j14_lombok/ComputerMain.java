package j14_lombok;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer computer = Computer.builder()
				.code(2024001)
				.name("코리아컴퓨터")
				.year(2024)
				.build();
		
		Computer computer2 = Computer.builder()
				.year(2025)
				.code(2024001)
				.build();
		
		System.out.println(computer);
		System.out.println(computer2);
	}

}
