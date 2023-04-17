package methodAssignment;

import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileEligibility totalPointsScored = new FileEligibility();
		totalPointsScored.educationalQualification();
		System.out.println("Enter your experience in years : ");
		int NumberOfYearsExperience = sc.nextInt();
		totalPointsScored.workExperience(NumberOfYearsExperience);
		totalPointsScored.agePoints();
		totalPointsScored.scoreInIELTS();
		totalPointsScored.moreConditions();
		totalPointsScored.calculateTotalScore();

	}
}