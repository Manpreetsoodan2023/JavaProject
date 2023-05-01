package stringMethods;

import java.util.Scanner;

public class CityMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CityNames nameOfCities = new CityNames();
		nameOfCities.displayCityNames();

		System.out.println("Enter city name : ");
		String name = sc.next();
		boolean cityNameFound = nameOfCities.searchCityName(name);
		if (cityNameFound) {
			System.out.println("City name found");

		} else
			System.out.println("City not found in the list");

		nameOfCities.printCitiesWithSubString("ton");

		nameOfCities.replaceStringInCityNames("ton", "fun");

		nameOfCities.extractSubStringFromString();

	}
}
