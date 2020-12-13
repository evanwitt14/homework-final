
public class TestDiscount {

	public static void main(String[] args) {
		
		BulkDiscount obj1 = new BulkDiscount(5, 10);
		
		double theDiscount = obj1.computeDiscount(5, 10);
		
		System.out.println("You have 5 items and each costs $10, discount amount is "+theDiscount);
		
		theDiscount = obj1.computeDiscount(10,  10);
			System.out.println("You have 10 items and each costs $10, discount is "+theDiscount);
			
	}

}
