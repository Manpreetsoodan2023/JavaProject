package arrayExample;

import java.util.Scanner;

public class PhoneBrands {

	String brandName;
	String productName;

	String[] SamsungProducts = { "S20", "S21", "Flip3", "Fold3" };
	String[] GoogleProducts = { "Googlepixel6", "Googlepixel6Pro", "GooglepixelPro", "Googlepixel5" };
	String[] AppleProducts = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11Pro" };
	Scanner sc = new Scanner(System.in);

	void displayProducts() {

		System.out.println("Enter brand Name");

		brandName = sc.next();

		switch (brandName) {

		case "Samsung":

			for (int i = 0; i < SamsungProducts.length; i++) {

				System.out.println(SamsungProducts[i]);
			}

			break;

		case "Google":

			for (int j = 0; j < GoogleProducts.length; j++) {
				System.out.println(GoogleProducts[j]);
			}

			break;

		case "Apple":

			for (int k = 0; k < AppleProducts.length; k++) {
				System.out.println(AppleProducts[k]);

			}

			break;

		}

		System.out.println("Enter any product name from the list of displayed products :");
		productName = sc.next();

		if ((productName.equals("S20")) || (productName.equals("S21")) || (productName.equals("Flip3"))
				|| (productName.equals("Fold3"))) {

			System.out.println("Product selected is : " + productName);

		}

		else if ((productName.equals("Googlepixel6")) || (productName.equals("Googlepixel6Pro"))
				|| (productName.equals("GooglepixelPro")) || (productName.equals("Googlepixel5"))) {

			System.out.println("Product selected is : " + productName);
		}

		else if ((productName.equals("Iphone12")) || (productName.equals("Iphone12mini"))
				|| (productName.equals("Iphone11")) || (productName.equals("Iphone11Pro"))) {

			System.out.println("Product selected is : " + productName);

		}

		else {

			System.out.println("Please select a product from the list");
		}

	}

}
