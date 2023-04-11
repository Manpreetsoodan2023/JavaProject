package practicePrograms;

import java.util.Scanner;

public class PracticePrograms {

//	int num;
//	double num1;
//	double num2;
//	int num3;
//	String weekday;
	int month;
	int year;
	String monthName;
	int numberOfDays;

	Scanner sc = new Scanner(System.in);

//	void printPositiveNumbers() {
//
//		System.out.println("Enter any number");
//		num = sc.nextInt();
//
//		if (num > 0) {
//
//			System.out.println("Entered number is positive");
//
//		} else if (num < 0)
//
//		{
//			System.out.println("Entered number is not positive");
//
//		}
//
//		else {
//			System.out.println("Entered number is 0");
//
//		}
//	}
//
//	void largestNumber() {
//
//		System.out.println("Enter 1st number");
//		num1 = sc.nextInt();
//		System.out.println("Enter 2nd number");
//		num2 = sc.nextInt();
//		System.out.println("Enter 3rd number");
//		num3 = sc.nextInt();
//
//		if (num1 > num2 && num1 > num3) {
//
//			System.out.println("Largest number is " + num1);
//		}
//		if (num2 > num3 && num2 > num1) {
//			System.out.println("Largest number is " + num2);
//		} else {
//			System.out.println("Largest number is " + num3);
//
//		}
//	}
//
//	void printWeekDay() {
//
//		System.out.println("Enter any number between 1 and 7");
//		num = sc.nextInt();
//		
//		switch(num){
//			
//			case 1: weekday = "Monday"; break;
//			case 2: weekday = "Tuesday"; break;
//			case 3: weekday = "Wednesday"; break;
//			case 4: weekday = "Thursday"; break;
//			case 5: weekday = "Friday"; break;
//			case 6: weekday = "Saturday"; break;
//			case 7: weekday = "Sunday"; break;
//			default:weekday = "Invalid entry"; break;
//			
//		}
//		System.out.println("The weekday is : " +weekday);
//			
//		}
//	}
	
	
//	void checkDecimal() {
//		
//		System.out.println("Enter 1st number");
//		num1 = sc.nextDouble();
//		System.out.println("Enter 2nd number");
//		num2 = sc.nextDouble();
//		
//		num1 = num1*1000;
//		num1 = num1/1000;
//		
//		num2 = num2*1000;
//		num2 = num2/1000;
//		
//		if (num1 == num2) {
//			System.out.println("Entered numbers are same after decimal");
//			
//		}
//		else {
//			System.out.println("Entered numbers are not same");
//		}
//				
//	}
//	
	
	void printNumberOfDays() {
		
		System.out.println("Enter a month number");
		month =sc.nextInt();
		System.out.println("Enter a year");
		year = sc.nextInt();
		
		switch(month) {
		case 1: monthName = "January";
		numberOfDays = 31; break;
		case 2: monthName = "February";
		if(year%4==0)	{
			numberOfDays = 29;
		}
		else {
			numberOfDays = 28;
		}
		break;
		case 3: monthName = "March";
		numberOfDays = 31; break;
		case 4: monthName = "April";
		numberOfDays = 30; break;
		case 5: monthName = "May";
		numberOfDays = 31; break;
		case 6: monthName = "June";
		numberOfDays = 31; break;
		case 7: monthName = "July";
		numberOfDays = 31; break;
		case 8: monthName = "August";
		numberOfDays = 31; break;
		case 9: monthName = "September";
		numberOfDays = 31; break;
		case 10: monthName = "October";
		numberOfDays = 31; break;
		case 11: monthName = "November";
		numberOfDays = 31; break;
		case 12: monthName = "December";
		numberOfDays = 31; break;
		}
		
		System.out.println(numberOfDays);
		
	}

}

