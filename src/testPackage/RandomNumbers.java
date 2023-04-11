package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNumbers {

	double[] numbers = new double[10];


	Scanner sc = new Scanner(System.in);
	
	void populateNumbers() {

		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println("Enter number " + (i+1) + " : ") ;

			numbers[i] = sc.nextDouble();

		}
			System.out.println(Arrays.toString(numbers));

		
	}

}
