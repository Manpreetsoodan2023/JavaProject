package loopAssignment;

import java.util.Scanner;

public class CalculatorProgram {

	double n;
	double square;
	double cube;

	Scanner sc = new Scanner(System.in);

	void squareOfNumbers() {

		System.out.println("Enter a number");

		n = sc.nextDouble();

		square = n * n;

		System.out.println("Square of number : " + square);
	}

	void cubeOfNumbers() {

		System.out.println("Enter a number");

		n = sc.nextDouble();

		cube = n * n * n;

		System.out.println("Cube of number : " + cube);
	}
}
