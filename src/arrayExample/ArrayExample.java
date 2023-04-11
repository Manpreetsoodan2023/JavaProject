package arrayExample;

public class ArrayExample {

	// declaring an array - dataType[] nameOfArray
	// initializing an array - dataType[] nameOfArray = new dataType[]

	int number;

	int[] divideArray = new int[10];

	void checkDivisibility() {

		for (int i = 0; i <= 9;) {

			for (number = 1; number <= 150; number++) {

				if (number % 3 == 0 && number % 5 == 0) {

					divideArray[i] = number;

					i++;

				}

			}

		}

	}
}