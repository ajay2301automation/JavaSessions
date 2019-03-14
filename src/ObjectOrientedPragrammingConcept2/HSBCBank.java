package ObjectOrientedPragrammingConcept2;

public class HSBCBank implements USBank , BrazilBank{  //achieving multiple inheritance // Is a relationship
// if a class in implementing any interface that it is mandatory to define all the methods of interface and class can have its own methods.
	public void credit() // overriding from USBank
	
	{
		System.out.println("HSBC credit method");
	}
	public void debit()// overriding from USBank
	{
		System.out.println("HSBC debit method");
	}
	public void transfermoney()// overriding from USBank
	{
		System.out.println("HSBC transfermoney");
	}
	public void educationloan()
	
	{
		System.out.println("HSBC education loan");
	}
	public void carloan()
	{
		System.out.println("HSBC carloan");
	}
	public void mutualfund() // overriding from BrazilBank
	{
		System.out.println("HSBC Mutual Funds");
	}
}