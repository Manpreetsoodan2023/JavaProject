package loopAssignment;

import java.util.Scanner;

public class PrintTable {

	
	int num;

	Scanner sc = new Scanner(System.in);
	
	void printATable() {
		
		System.out.println("Enter any number");
		
		num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
		
		System.out.println(num + "*" + i + "=" + num*i);
		
		}
		
	}
}
