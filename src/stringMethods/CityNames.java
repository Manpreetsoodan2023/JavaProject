package stringMethods;

public class CityNames {

	String name;
	String newName;
	String[] cityNames = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };
	String str = "100 queen street,Toronto,M5V 3V3";
	String streetAddress;

	void displayCityNames() {

		for (int i = 0; i < cityNames.length; i++) {
			System.out.println(cityNames[i]);

		}
	}

	void searchCityName(String name) {
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].equalsIgnoreCase(name)) {
				System.out.println("City name found");
			} else
				System.out.println("City not found in the list");

		}
	}

	void checkNamesForSpecificString(String subString) {
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].endsWith(subString)) {
				System.out.println(cityNames[i]);

			}
		}

	}

	void replaceStringInCityNames(String substring, String newSubString) {
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].endsWith(substring)) {
				newName = cityNames[i].replaceAll(substring, newSubString);
				System.out.println(newName);

			}
		}

	}

	void extractWordsFromString(String streetAddress, String cityName, String zip) {

		if (str.contains(streetAddress)) {
			System.out.println("Street address is : " + streetAddress);
		}
		if (str.contains(cityName)) {
			System.out.println("City name is : " + cityName);

		}
		if (str.contains(zip)) {
			System.out.println("ZIP is : " + zip);

		}

	}
}
