package loopsExample;

public class PrintTable {

int number;
	
	void printTableOf2() {
		
		int finalNumber = number*10;
		
		while(number<=finalNumber) {
			System.out.println(number);
			number +=2;
		}
	}
}
