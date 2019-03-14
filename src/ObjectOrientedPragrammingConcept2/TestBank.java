package ObjectOrientedPragrammingConcept2;

public class TestBank {

	public static void main(String[] args) {
		//USBank b=new USBank(); object of interface cannot be created
	
		// we are achieving compile time polymorphism
		
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.carloan();
		hs.educationloan();
		hs.mutualfund();
		
		// dynamic polymorphism	:
		// child class object can be referred by parent interface reference varialbe
		System.out.println("********");
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		//b.educationloan(); we cannot use it same as dynamic polymorphism in classes
		// only overridden methods can be called here.
		

		System.out.println(USBank.min_balance); // using static variable
		

	}

}
