package ObjectOrientedProgrammingConcept;

public class StaticAndNonStaticConcept {
	String name ="Tom"; // non static global variable
	 static int age=34; // static global variable.
	// global variables: the scope of global variable will be available through out the program
	 //but, static methods and variable should be called directly or by classname
	 // nonstatic methods and variable should be called by object of class.

	public static void main(String[] args) {
		// how to all static methods and variables
		// 1. direct calling
		sum();
	
		
		//2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		// same for variable
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		// how to call non static methods and variables
		
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		
		// static methods and variables will not be given to obj, a differnt m/m will be given to them
		// but obj will have access on the differnt m/m
		
		obj.sendmail();
		System.out.println(obj.name);
		obj.sum(); // static methods can be accessed by obj, but it is not a good practice.
		
		// practicing below
		System.out.println("working on static methods and static variables");
		sum();
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		System.out.println("working on non static methods and non static variable"
				+ "here we have to use object of class");
		obj.sendmail();
		System.out.println(obj.name);
		// now we will try to use sendmail without object
		// sendmail(); we were getting error.
		obj.sum(); // this is allowed by not a good practice
		
		System.out.println("so summary is static method and variables can be called by two:" + "1. Direct calling "+"2nd By classname");
		System.out.println("Non static methods and variable will be called by Object of Class");
		
		// again practice
		System.out.println("Static methods");
		sum();
		StaticAndNonStaticConcept.sum();
		System.out.println("Static Variables");
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		System.out.println("****************************");
		System.out.println("Non Static Methods");
		obj.sendmail();
		System.out.println("Non Static Variable");
		System.out.println(obj.name);
		
		
		
		

	}
	public void sendmail() // non static
	{
		System.out.println("send mail method");
	}
	
	public static void sum() // static method
	{
		System.out.println("sum method");
	}
	

}
