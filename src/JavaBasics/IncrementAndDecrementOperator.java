package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		//++
		//--
		System.out.println("post increment below");
		int i=1;
		int j=i++; // post increment means value of i will be given to j so j=1 and then value of i is increased by 1 then value of i is 2
		System.out.println("value of i:"+i);
		System.out.println("value of j:"+j);
		System.out.println("******************");	
		
		System.out.println("pre increment below");
		
		int a=1;
		int b=++a; // pre increment  means increase the value of a first then assign the value to b
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("******************");
		
		
		System.out.println("post decrement below");
		//post decrement
		int x=2;
		int y=x-- ;// post decrement means assing the value of x to y so y=2 and then decrease the value of x so x=1
		System.out.println("value of x:"+x);
		System.out.println("value of y:"+y);
		
		System.out.println("******************");
		
		
		System.out.println("pre decrement below");
		//pre decrement
		
		int p=10;
		int q=--p;
		System.out.println("value of p:"+p);
		System.out.println("value of q:"+q);
		
		
				
	}

}
