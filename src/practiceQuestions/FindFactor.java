package practiceQuestions;

import java.util.Scanner;

public class FindFactor {

	int number;
	int[] array = new int[5];
 char ch;
	
	Scanner sc = new Scanner(System.in);
	
//	
//	public void printAllFactors() {
//		
//		System.out.println("Enter any number");
//		number = sc.nextInt();
//		
//		for(int i=1 ; i<=number ; i++) {
//			if(number%i == 0) {
//				System.out.println(i + " ");
//			}
//		}
//		
//	}
	
//	public void printArray() {
//	
//	Scanner sc=new Scanner(System.in);
//	
//    int arr[]=new int[10];
//    
//    System.out.println("Enter elements in array");
//    
//    int min=Integer.MAX_VALUE;
//    int max=Integer.MIN_VALUE;
//    
//    for(int i=0;i<=9;i++)
//    {
//      arr[i]=sc.nextInt();
//      
//      if(arr[i]<min)
//        {
//        min=arr[i];
//        }
//      if(arr[i]>max)
//      {
//        max=arr[i];
//      }
//    }
//    System.out.println("Maximum element is "+max);
//    System.out.println("Minimum element is "+min);
//    
//	}
	
//	public void descendingOrder() {
//		
//		System.out.println("Enter elements you would like to sort");
//		for(int i = 0 ; i<array.length ; i++) {
//			array[i] = sc.nextInt();
//		}
//		int temp = 0;
//		
//		for(int i = 0 ; i<array.length ; i++ ) {
//			
//			for(int j = i+1 ; j<array.length ; j++) {
//				if(array[j] > array[i]) {
//					temp = array[i];
//					array[i]= array[j];
//					array[j]= temp;
//					
//				}
//			}
//		}
//		System.out.println("Elememnts in descending order are ");
//		for(int i = 0 ; i<array.length ; i++) {
//		System.out.println(array[i]);
//		}
//	}
	
//	public boolean checkSubString(String name, String subName) {
//		boolean flag = name.contains(subName);
//		
//	if(flag) {
//		System.out.println("substring is present");}
//	else {
//		System.out.println("substring is not present");
//	}
//	return flag;
//	}
	
//	public void checkIfVowel() {
//		System.out.println("Enter any character: ");
//		ch = sc.next().charAt(0);
//		
//		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.println("Entered character is vowel");
//		}
//		else {
//			System.out.println("Entered character is not vowel");
//		}
//	}
	
	public void reverseString() {
		System.out.println("Enter any string: ");
		String origString = sc.next();
		String reverseString = "";
		for(int i= 0; i<origString.length(); i++) {
			reverseString = origString.charAt(i)+ reverseString;
		}
		System.out.println(reverseString);
	}
}