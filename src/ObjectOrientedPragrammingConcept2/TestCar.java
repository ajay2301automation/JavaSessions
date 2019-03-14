package ObjectOrientedPragrammingConcept2;

public class TestCar {

	public static void main(String[] args) {
		// we will create object of BMW Class here
		
		
		
		// this is called static polymorphism , or compile time polymorphism
		BMW b= new BMW();
		b.start(); // now start method is common in Parent and child class with same argument and datatypes
		// here preference will be give to child class start method.
		
		System.out.println("this is called method overriding");
		b.stop();
		b.refuel();
		b.safety();
		b.engine();
		
		
		
		System.out.println("**********************");
		Car c= new Car();
		c.start();
        c.stop();
        c.refuel();

       //c.safety(); this is not allowed, as parent class cannot inherit child class properties
        
        
        // Top Casting: refering the child class object with Parent class variable
        Car c1=new BMW();
        // this is allowed as child class object can be referred by Parent class reference variable
        //this is called Dynamic polymorphism or run time polymorphism
        c1.start(); //child method will be used
        c1.stop();
        c1.refuel();
       // c1.safety(); we cannot use this method from this
        
        // down casting: 
        
   // BMW b1=(BMW)new Car(); // ClassCastException
        
        


	}

}
