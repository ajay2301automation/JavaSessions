package JavaBasics;

public class B extends A{

	public B()
	{
	
		super(3,4); // it all depend on passing parameter in super()
		//super should be the first statement in child class.
		// it will call the second constructor of Class A. 3,4 will be given to k and l
		System.out.println("child class constructor");
		
		//if we will no execute super() then it will execute 1st constructor of Class A and class B
		// now we are using super() and we will pass parameter then it will execute the constructor of Parent class which will meet the argument type and argument number 
	}
	
	public static void main(String args[])
	{
		B obj=new B();
		// the moment we create object of this class, it will immediately go to constructor of this Class, but before executing this , it will check that child is extending parent class, then it will go to parent class and it will check whether parent class is having default constructor of not, and it will execute constructor of parent class.
			
	}
}
