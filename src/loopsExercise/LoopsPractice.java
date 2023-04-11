package loopsExercise;

import java.util.Scanner;

public class LoopsPractice {

	int n;
	int k = 1;
	
//	int sum;
//	int num = 1;

//	int n;
//	int sum;
//	double avg;
//
	Scanner sc = new Scanner(System.in);
//
//	void printSum() {
//
//		System.out.println("Input 5 numbers");
//
//		for (int i = 1; i <= 5; i++) {
//			n = sc.nextInt();
//			
//			sum += n;
//			
//		}
//		avg = sum /5;
//		
//		System.out.println("The sum of numbers is : " + sum);
//		System.out.println("The average of numbers is : " + avg);
//
//	}

//	void sumOfEvenNumbers() {
//
//		System.out.println("Enter value of n");
//		n = sc.nextInt();
//
//		for (int i = 1; i <= n;) {
//
//			if (num % 2 == 0) {
//
//				sum += num;
//
//				i++;
//
//			}
//
//			num++;
//		}
//
//		System.out.println("Sum of " + n + " even numbers is " + sum);
//	}

//	void sumOfOddNumbers() {
//		System.out.println("Enter value of n");
//		n = sc.nextInt();
//
//		for (int i = 1; i <= n; ) {
//
//			if (num % 2 != 0) {
//				sum += num;
//				i++;
//				System.out.println(num);
//			}
//    
//			num++;
//		}
//		System.out.println("Sum of odd numbers is " + sum);
//	}

	void printRightTriangle() {
		System.out.println("Enter number of rows");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(k++);
				
			}
				System.out.println("");
				
			}

	}
}
