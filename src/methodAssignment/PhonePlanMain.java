package methodAssignment;

import java.util.Scanner;

public class PhonePlanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		MobilePhonePlan planCost = new MobilePhonePlan();
		planCost.selectBrand();
		planCost.displayBrandModel();
		planCost.selectModel();
		planCost.selectServiceProvider();
		planCost.totalMonthlyBill();
		
	}
}