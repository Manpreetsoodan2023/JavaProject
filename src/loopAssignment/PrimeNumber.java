package loopAssignment;

import java.util.Scanner;

public class PrimeNumber {

	int num;
	int i=2;
	
	Scanner  sc = new Scanner(System.in);
	
	void printPrimeNumber() {
		
	System.out.println("Enter a positive integer");
	
	num = sc.nextInt();
	
	while(i<=num/2)
		
			i++;
	
	if (num%2 == 0) {
	
	System.out.println("Entered number is not a prime number");
	
	}
	
	else 
		
		System.out.println("Entered number is a prime number");
		
	}
	
}
