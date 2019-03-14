package ObjectOrientedPragrammingConcept2;

public interface USBank {
	
	
	// in interface we only create methods, just declare the methods, we will not define the body.
	// no method body
	// just method body
	// in interface we can declare the variables, and variables are static in nature
	// we cannot change the value of variables, it is final in nature.
	// no static method in interface
	// no main method
	// we cannot create the object of interface, interface is abstract in nature.

	int min_balance= 100;
	public void credit();
	public void debit();
	
	public void transfermoney();
	
	

}
