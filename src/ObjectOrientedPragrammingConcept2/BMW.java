package ObjectOrientedPragrammingConcept2;

public class BMW extends Car{ //  has a relationship
	
	// BMW is child class, and Car class is parent, BMW is inheriting Car Class with extend keyword
	// when same method is preset in Parent class as well as in child class with same name and same number of arguments is called method overriding
	public void start() // this is overridden method
	{
		System.out.println("BMW start");
	}
	public void safety()
	{
		System.out.println("Advanced safety");
	}
}
