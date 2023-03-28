package calculatingDiscount;

public class DiscountProgram {

	double price;
	double totalDiscount;
	String promo;
	
	void priceWithDiscount() {
		
		totalDiscount = price*0.5;
		
		System.out.println("Final price of product without any promocode is " + totalDiscount);
		
		if(promo == "promo1") {
			totalDiscount *= 0.95;
			System.out.println("Final price of product with 5% discount is " + totalDiscount);
		}
		else if(promo == "promo2") {
			totalDiscount *= 0.9;
			System.out.println("Final price of product with 10% is " + totalDiscount);
		}
		else if(promo == "promo3") {
			totalDiscount *= 0.8;
			System.out.println("Final price of product with 20% is " + totalDiscount);
			
		}
	}
		
}
