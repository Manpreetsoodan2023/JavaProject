package javaConditions;

public class ConditionalStatements {

	int n1;
	int n2;
	int n3;

	void largestNumber()
	{

		if(n1>n2) {

			if(n1>n3) {
					
					System.out.println("Largest number is " + n1);	
				}
				
			else {
					
					System.out.println("Largest number is" + n3);	
				}
			}
				
			else {
					
			if (n2>n3) {
						
					System.out.println("Largest number is " + n2);	
					}
			
			else {
					System.out.println("Largest number is " + n3);
					
				}
				
			}
	}
}