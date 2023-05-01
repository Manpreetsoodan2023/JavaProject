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

	boolean searchCityName(String name) {

		boolean cityNameFound = false;
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].equalsIgnoreCase(name)) {

				cityNameFound = true;
			}
		}
		return cityNameFound;
	}

	void printCitiesWithSubString(String subString) {
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

	void extractSubStringFromString() {

		String streetAddress = str.substring(0, str.indexOf(","));
		System.out.println("Street address is : " + streetAddress);

		String cityAddress = str.substring(str.indexOf(",") + 1, str.lastIndexOf(","));
		System.out.println("City address is : " + cityAddress);

		String zip = str.substring(str.lastIndexOf(",") + 1, str.lastIndexOf("3") + 1);
		System.out.println("ZIP is : " + zip);
	}
}
