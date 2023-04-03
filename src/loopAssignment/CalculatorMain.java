package loopAssignment;

public class CalculatorMain {

	public static void main(String[] args) {

		CalculatorProgram CP = new CalculatorProgram();
		String operation = "square";

		switch (operation) {
		case "square":
			CP.squareOfNumbers();
			break;

		case "cube":
			CP.cubeOfNumbers();
			break;

		default:
			System.out.println("invalid operation");
			
		}
	}

}
