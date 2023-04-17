package methodAssignment;

import java.util.Scanner;

public class FileEligibility {

	String qualification;
	int eduPoints;
	int NumberOfYearsExperience;
	int expPoints;
	int age;
	int agePoints;
	double listeningScore;
	double listeningPoints;
	double speakingScore;
	double speakingPoints;
	double readingScore;
	double readingPoints;
	double writingScore;
	double writingPoints;
	int extraPoints;
	String answer;
	double IELTSPoints;
	double totalPointsScored;

	Scanner sc = new Scanner(System.in);

	void educationalQualification() {

		System.out.println("Enter your Education level : ");
		qualification = sc.next();
		switch (qualification) {
		case "PhD":
			eduPoints = 25;
			break;
		case "Masters":
			eduPoints = 23;
			break;
		case "two or more university degrees/diplomas at the bachelor level one of which is a three year or longer duration":
			eduPoints = 22;
			break;
		case "12th and 3 years or longer degree/diploma":
			eduPoints = 21;
			break;

		}

	}

	int workExperience(int NumberOfYearsExperience) {
		if ((NumberOfYearsExperience == 4) || (NumberOfYearsExperience == 5)) {
			expPoints = 13;
		} else if (NumberOfYearsExperience >= 6) {
			expPoints = 15;
		}
		return expPoints;

	}
	
	void agePoints() {
		System.out.println("Please enter your age in years :");
		age = sc.nextInt();
		if (age>=18 && age<=35) {
			agePoints = 12;
		}
		else if (age >=36 && age<=46) {
			switch(age) {
			case 36:
				agePoints = 11;	
				break;
			case 37:
				agePoints = 10;	
				break;
			case 38:
				agePoints = 9;	
				break;
			case 39:
				agePoints = 8;	
				break;
			case 40:
				agePoints = 7;
				break;
			case 41:
				agePoints = 6;	
			case 42:
				agePoints = 5;
				break;
			case 43:
				agePoints = 4;
				break;
			case 44:
				agePoints = 3;
				break;
			case 45:
				agePoints = 2;
				break;
			case 46:
				agePoints = 1;	
				break;
			}
		}
		else 
			agePoints = 0;
		
	}

	void scoreInIELTS() {
		System.out.println("Enter your IELTS score for Listening : ");
		listeningScore = sc.nextDouble();
		if (listeningScore >= 8 && listeningScore <= 9) {
			listeningPoints = 6;
		}else if (listeningScore == 7.5) {
			listeningPoints = 5;
		}
		else 
			listeningPoints = 0;
		System.out.println("Enter your IELTS score for Speaking : ");
		speakingScore = sc.nextDouble();
		if (speakingScore >= 7 && speakingScore <= 9) {
			speakingPoints = 6;
		}else if (speakingScore == 6.5) {
			speakingPoints = 5;
		}
		else 
			speakingPoints = 0;
		System.out.println("Enter your IELTS score for Reading : ");
		readingScore = sc.nextDouble();
		if (readingScore >= 7 && readingScore <= 9) {
			readingPoints = 6;
		} else if (readingScore == 6.5) {
			readingPoints = 5;
		}
		else 
			readingPoints = 0;
		System.out.println("Enter your IELTS score for Writing : ");
		writingScore = sc.nextDouble();
		if (writingScore >= 7 && writingScore <= 9) {
			writingPoints = 6;
		} else if (writingScore == 6.5) {
			writingPoints = 5;
		}
		else 
			writingPoints = 0;
		IELTSPoints = (listeningPoints + speakingPoints + readingPoints + writingPoints);
	}

	void moreConditions() {
		System.out.println("Do you have a relative in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N):");
		String answer1 = sc.next();
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		String answer2 = sc.next();
		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		String answer3 = sc.next();
		if ((answer1.equals("Y")) && (answer2.equals("Y")) && answer3.equals("Y")) {
			extraPoints = 20;
		} else if ((answer1.equals("Y")) && (answer2.equals("Y")) && answer3.equals("N")) {
			extraPoints = 10;
		} else if ((answer1.equals("Y")) || (answer2.equals("N")) && answer3.equals("Y")) {
			extraPoints = 15;
		} else if ((answer1.equals("Y")) && (answer2.equals("N")) && answer3.equals("N")) {
			extraPoints = 5;
		} else
			extraPoints = 0;
	}

	void calculateTotalScore() {

		totalPointsScored = eduPoints + expPoints + agePoints + IELTSPoints + extraPoints;
		System.out.println("Total points you have scored : " + totalPointsScored + " Points");
	if (totalPointsScored>=67) {
		System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
	}
	else
		System.out.println("You don't qualify to submit an Expression of Interest (EOI) to Immigration Canada");
	}

}
