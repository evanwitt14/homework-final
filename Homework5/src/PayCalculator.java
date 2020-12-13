//Create an abstract class PayCalculator that has an attribute payRate given in dollars per hour. The
//class should also have a method computePay(hours) that returns the pay for a given amount of
//time.

public abstract class PayCalculator {
	public double payRate = 10;
	
	public double computePay(double hours) {
		return payRate * hours;
	}
	
}
	




