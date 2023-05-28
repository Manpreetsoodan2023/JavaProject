package arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayListDemo students = new ArrayListDemo();
		students.displayNames();

		List<String> studentList = new ArrayList<String>();
		studentList.add("Manpreet");
		studentList.add("Deep");
		studentList.add("Preet");
		studentList.add("Ishita");
		studentList.add("Jagman");

		System.out.println(studentList.toString());

		// remove name from list

		System.out.println("Enter name you would like to remove : ");
		String nameToRemove = sc.next();

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).equals(nameToRemove)) {
				studentList.remove(i);
				System.out.println(studentList.toString());
			}
		}

		// replace name from list - set() method is used

		System.out.println("Enter name you would like to replace with new name : ");
		String nameToReplace = sc.next();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).equals(nameToReplace)) {
				studentList.set(i, "Mandeep");
				System.out.println(studentList.toString());
			}
		}

// contain method, it returns boolean - if specific element exist in given list

		boolean namePresent = studentList.contains("Manpreet");

		if (namePresent) {
			System.out.println("Name is present in the list");
		} else
			System.out.println("Name is not present in the list");
	}

}
