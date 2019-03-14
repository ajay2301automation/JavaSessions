package ObjectOrientedProgrammingConcept;

public class Car {
	//class variable
	int mod;
	int wheel;
String feature;

	public static void main(String[] args) {
		// new Car(); is Object of Car Class

		Car a= new Car(); // right hand side is the object and a is reference variable.
		Car b= new Car();
		Car c= new Car();
		
		// when we create object copy of int mod;  and int wheel; will be provided to a, b, c
		// new keyword is used to create object
		//a , b, c are object reference variable. 
		//a.mod= 2018;
	//	a.wheel=18;
		
		a.mod=2999;
		a.wheel=34;
		a.feature= "Compact SUV";
		
		b.mod=2017;
		b.wheel=16;
		
		c.mod=2018;
		c.wheel=17;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(a.wheel+c.mod);
		
		System.out.println("again trying by my own");
		System.out.println("value of result is:"+ a.mod+"     "+a.feature);
		System.out.println("value of result is:"+b.wheel);
		
		
		// we will change the reference variables
		a=b;
		b=c;
		c=a;
		
		
		System.out.println(a.mod); // we will get the value of b.mod, because a=b
		System.out.println(c.mod); // we will get the value of b.mod, because b=c and c=a so again a=b we are getting the same
		System.out.println(b.mod); // we will get c.mod because b=c
	}

}
