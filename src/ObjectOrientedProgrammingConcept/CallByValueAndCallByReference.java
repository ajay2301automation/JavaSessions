package ObjectOrientedProgrammingConcept;

public class CallByValueAndCallByReference {
	int p; // non static variable so we will ininiate the variable by using object in main method.
	int q;
	

	public static void main(String[] args) {
		CallByValueAndCallByReference obj= new CallByValueAndCallByReference();
int x =20;
int y= 24;
int k= obj.testsum(x, y); // this is called call by value of pass by value
 // in this case on copy of x and y will be given to a and b.
 
System.out.println("value of testsum method is :"+k);

obj.p=20;
obj.q=39;
obj.swap(obj); // we are calling the swap method , this line will create t=obj  as obj is parameter and it will be given to t
System.out.println("After swaping");

System.out.println("Value of P after swapping:"+obj.p);
System.out.println("Value of Q after swapping:"+obj.q);


	}
	
	public int testsum(int a, int b)
	{
		int c=a +b;
		return c;
		
		
		
		
	}
	
	// this is called call by reference
	
	public void swap(CallByValueAndCallByReference t) // here we are creating a method by class reference
	{
		// public void swap(CallByValueAndCallByReference t) this line will give t=obj, because both will refer the object now
		// t is the reference variable of Class.
		int temp;
		temp= t.p;// now temp will be 20
		t.p= t.q; // now 39 the value of q will be given to p
		t.q=temp; // now q will be 20
		
	}

}
