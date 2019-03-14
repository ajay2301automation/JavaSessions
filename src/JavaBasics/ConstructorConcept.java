package JavaBasics;

public class ConstructorConcept {
// constructor is a class entity, it is used to define class properties while creating the objects
	
	
	public ConstructorConcept()  // this is the way to create default constructor(zero parameter)
	
	{
		System.out.println("Default constuctor");
	}
	
	public ConstructorConcept(int i)
	{
		System.out.println("single paramter constructor");
		System.out.println("value of i is:"+i);
	}
	
	public ConstructorConcept(int i, int j) // constructor overload
	{
		System.out.println("Two parameter constructor");
		System.out.println("value of i is:"+i);
		System.out.println("value of j is:"+j);
	}
	public static void main(String[] args) {
		
		// moment we create the object, constructor will be called by default
	
		ConstructorConcept cc=new ConstructorConcept();
		ConstructorConcept cc1=new ConstructorConcept(12);
		ConstructorConcept cc2=new ConstructorConcept(23, 23);

	}

}
