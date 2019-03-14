package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		
		if(b>a)
		{
			System.out.println(" b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
			
		}

		// comparison operators:
		// < > <=  => == 
		
		int c=50;
		int d=50;
		
		// we will not do c=d ( it means we are assigning the value of d into c
		// == means comparison operator
		
		if(c==d)
		{
			System.out.println("c and d are equal");
		}
		else
		{
			System.out.println("c and d are not equal");
		
		}
		//highest number
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		// nested if else
		
		if(a1>b1 & a1>c1)
		{
			System.out.println("a is greatest");
			
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
		
		int a2=500;
		int b2=600;
		int c2=250;
		
		if(a2>b2 & a2>c2)
		{
			System.out.println("a2 is greatest");
		}
		else if(b2>c2)
		{
			System.out.println("b2 is greatest");
		}
		else
		{
			System.out.println("c2 is greatest");
		
		}
		}
		


}
