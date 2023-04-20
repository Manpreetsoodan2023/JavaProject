package stringMethods;

import java.util.Scanner;

public class CityMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CityNames nameOfCities = new CityNames();
		nameOfCities.displayCityNames();

		System.out.println("Enter city name : ");
		String name = sc.next();
		nameOfCities.searchCityName(name);

		nameOfCities.checkNamesForSpecificString("ton");

		nameOfCities.replaceStringInCityNames("ton", "fun");

		nameOfCities.extractWordsFromString("100 queen street" , "Toronto" , "M5V 3V3");
		
	}

}
