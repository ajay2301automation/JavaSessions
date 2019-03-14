package ObjectOrientedProgrammingConcept;

public class LocalVsGlobalVariables {
	//Global variable or Class Variable are below
	String name="Name";
	int age=29;
	

	public static void main(String[] args) {
		int age=18; // local variable
		System.out.println("testing purpose:"+age); // printing local variable
		
	//	System.out.println(age); it will give error because we are using global variable.
		// for accessing this we have to make object of Class
		
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		// when we create object of class , copy of global variables will be given to object 
		//and copy of non static methods will be given
		
		System.out.println("value of age from Class:"+obj.age);// we are getting age from Class
		System.out.println(obj.age);// we are getting age from Class
		
		System.out.println(obj.age); // we are getting age from Class
		System.out.println(obj.sum()); // we are using sum method
		
		int t=obj.sum();
		System.out.println("this is the another way to get the output from sum:"+t);
		int l= (obj.age)+t;
		System.out.println(l);
		// we will use value of j from sum
	//	int y=obj.sum();
	//	System.out.println("by some manipulation value if j:"+y);
		
		
		
		
	
	}
	public int sum()
	{	
		int i=18;
		int j=23;
		int h=j;
		int age=40;
		int k= i+j+age;
		return k;
	//	return h;
		
		
		
		
	//	System.out.println(age); // it will not print anything, this thing we have to do in main method using object.
		
		
	}

}
