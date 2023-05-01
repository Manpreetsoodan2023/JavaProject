package gameAssignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GameMain {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(new File("C:\\Users\\parte\\Downloads\\Output.txt"));
		ArrayList<String> studentNames = new ArrayList<>();

		while (scanner.hasNextLine()) {
			studentNames.add(scanner.nextLine());
		}
		
		String randomName = studentNames.get((int) (Math.random()* studentNames.size()));
 char[] textArray = randomName.toCharArray();
 
	}

}
