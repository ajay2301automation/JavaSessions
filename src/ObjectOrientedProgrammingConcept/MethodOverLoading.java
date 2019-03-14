package ObjectOrientedProgrammingConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj =new MethodOverLoading();
		obj.sum();
		obj.sum(1);
		obj.sum(90,23);
		
	}
	
	// we can overload main methods also
	
	public static void main(int k)
	{
		
	}
	
	public static void main(int f , int d)
	{
		
	}
	
	// when the method name is same with different inputs in the same class.
	public void sum()
	{
		System.out.println(" zero parameter");
	}
	
	/*public void sum()
	{
	}*/
	
	// we cannot create method inside a method
	// we cannot create method with same name with same argument type ,
	// we can create same method name with different type of data type and same number of argument
	
	
	public void sum(int i) // this is allowed as arguments are different
	{
		System.out.println("one input prameter");
		System.out.println("this is called method overloading");
		
	}
	public void sum(int p, int q)
	{
		System.out.println("with two parameter");
		System.out.println(p+q);
	}

}
