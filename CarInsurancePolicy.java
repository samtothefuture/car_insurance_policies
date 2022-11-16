//chap 4 practice exercise

public class CarInsurancePolicy
{
	//instance variables
	private int policyNumber;
	private int numPayments;
	private String residentCity;

	//constructor
	public CarInsurancePolicy(int num, int payments, String city)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}
	public CarInsurancePolicy(int num, int payments)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = "Mayfield";
	}

	public CarInsurancePolicy(int num)
	{
		policyNumber = num;
		numPayments = 2;
		residentCity = "Mayfield";
	}

	//accessor (getter) method
	public void display()
	{
		System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");
	}
}