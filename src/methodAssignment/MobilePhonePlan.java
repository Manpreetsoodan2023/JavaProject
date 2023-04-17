package methodAssignment;

import java.util.Scanner;

public class MobilePhonePlan {

	String brandName;
	String[] samsungModels = { "S22", "S22+", "S22ultra", "S22FE" };
	String[] appleModels = { "Iphone14", "Iphone14pro", "Iphone14promax", "Iphone14mini" };
	int[] samsungTab = { 25, 35, 55, 20 };
	int[] appleTab = { 30, 40, 65, 25 };
	int monthlyTab;
	int providerCost;
	int totalBill;
	String selectedProduct;
	String planProvider;
	Scanner sc = new Scanner(System.in);

	void selectBrand() {

		System.out.println("Please enter the Brand that you want to choose from Apple/Samsung: ");
		brandName = sc.next();
	}

	void displayBrandModel() {
		switch (brandName) {

		case "Samsung":
			for (int i = 0; i < samsungModels.length; i++) {
				System.out.println(samsungModels[i]);
			}
			break;
		case "Apple":

			for (int j = 0; j < appleModels.length; j++) {
				System.out.println(appleModels[j]);
			}

			break;
		}
	}

	void selectModel() {
		System.out.println("Please enter the model you want to buy from the above list : ");
		selectedProduct = sc.next();

		for (int i = 0; i < samsungModels.length; i++) {
			if (selectedProduct.equals(samsungModels[i])) {
				monthlyTab = samsungTab[i];
				System.out.println("Your monthly tab for " + samsungModels[i] + " is " + samsungTab[i]);
			}

			else if (selectedProduct.equals(appleModels[i])) {
				monthlyTab = appleTab[i];
				System.out.println("Your monthly tab for " + appleModels[i] + " is " + appleTab[i]);
			}
		}
	}

	void selectServiceProvider() {

		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		planProvider = sc.next();
		switch (planProvider) {

		case "Rogers":
			providerCost = 70;
			break;

		case "Telus":
			providerCost = 75;
			break;

		case "Bell":
			providerCost = 80;
			break;

		}
	}

	void totalMonthlyBill() {
		totalBill = monthlyTab + providerCost;
		System.out.println("Total monthly amount to be paid is " + totalBill + " in dollars ");
	}
}
