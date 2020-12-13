//Derive a class RegularPay from PayCalculator, as described in the previous exercise. It should have
//a constructor that has a parameter for the pay rate. It should not override any of the methods. Then
//derive a class HazardPay from PayCalculator that overrides the computePay method. The new
//method should return the amount returned by the base class method multiplied by 1.5.

public class RegularPay extends PayCalculator {
	
	public RegularPay() {
		this.payRate = 20;
	}
	
	public static void main(String [] args) {
		PayCalculator regularpaycheck = new RegularPay();
		System.out.println( regularpaycheck.computePay(11));
	}
}


	