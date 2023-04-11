package testPackage;

import java.util.Scanner;

public class RandomNumbers {

	double[] numberArray = new double[10];
	double numbers;

	Scanner sc = new Scanner(System.in);
	
	void populateNumbers() {

		System.out.println("Enter any random numbers: ");
		for (int j = 0 ; j<=10 ; j++) {
         numbers = sc.nextDouble();
		}

		for (int i = 0; i <= numberArray.length; i++) {

			numberArray[i] = sc.nextDouble();

			System.out.println(numberArray[i]);

		}
	}

}
