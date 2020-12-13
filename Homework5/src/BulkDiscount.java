
public  class BulkDiscount extends DiscountPolicy {
	int min;
	double percentOff;
	
	public BulkDiscount(int theMin, double thePercentOff) {
		min = theMin;
		percentOff = thePercentOff;
	}
	@Override
	public double computeDiscount(int amount, double itemPrice) {
		
		double discount = 0;
				if(amount>min) {
					discount = amount*itemPrice*percentOff/100;
				}
		return discount;
	}
	
}
