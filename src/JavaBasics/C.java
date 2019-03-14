package JavaBasics;

public class C extends A {
// calling  all the constructors 
	public C()
	{
		super();// now it will call the default constructor of Class A
	}
	
	public C(int i) // we are doing constructor overloading now i will be given to super, and value i will be taken from object which have created
	{
		super(i);// now it will call the default constructor of Class A
	}
	
	public C(int l, int q)
	{
		super(l,q);// now it will call the default constructor of Class A
	}
	
	public C(String s) // here we are not using super keyword so by default when we are creating the object Obj3, then it will get in  class B constructor, but Class B is extending Class A, so it will go to Class A constructor and it will execute it first,then Class B constructor will be executed.
	{
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		

		C obj=new C();
		
		C obj1=new C(12);
		C obj2=new C(12,12);
		C Obj3=new C("A");
	}

}
