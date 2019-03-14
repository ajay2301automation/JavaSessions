package JavaBasics;	

public class A {

	public A()
	{
		System.out.println("parent class constructor");
	}
	
	public A(int i)
	{
		System.out.println("value of i:"+i);
	}
	
	public A( int k, int l) // in child class we are using supper() with two arguments then it is executing this constructor
	{
		System.out.println("Value of k:"+k);
		System.out.println("value of l:"+l);
		System.out.println("Vale is this");
	}
	
}
