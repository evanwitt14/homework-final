public class HazardPay extends PayCalculator {

	public double computePay(double hours) {
			return super.computePay( hours)*1.5;
	}
	
	public static void main(String[] args) {
		PayCalculator hazardpaycheck = new HazardPay();
		System.out.println(hazardpaycheck.computePay(11));

	}
}
