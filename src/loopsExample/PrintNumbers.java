package loopsExample;

public class PrintNumbers {

	int number;
	
	void print10Numbers(){
		
		int finalNumber = number + 9;	
		
		do {
			
		System.out.println(number);
		number++;
		
		}
			
		while(number<=finalNumber);
			
	}
	
}
