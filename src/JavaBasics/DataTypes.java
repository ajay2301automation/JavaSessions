package JavaBasics;

public class DataTypes {
	// single line comments
	// multiline comments shown below :
	
	/* Hi This is my first java program
	and i will make many more */
	
//main method is the starting or execution point of program
	public static void main(String[] args) {
		
		// primitive data type: int, double, boolean, char
		
	
		// 1.  int
		
		int i =10;
		i=20; // now i will be 20 means we are replacing the value of i , latest value of i is 20
		int j=30;
		System.out.println(j);
	
		System.out.println(j+i);
		System.out.println(i++);
		
		int k=40;
		System.out.println("value of k:" );
		
		// 2. double
		
		double d=11.22;
		double d1=77.33;
		double d2=100;
		System.out.println(d1+d2);
		
		// we can store integer in double, we can not store double value in int
		 
		// 3. char : only single value for eg 'aa' is not allowed  should be written within single quotes.
		char c='a';
		char c1='A';
		
		//4. boolean:
		
		boolean b=true;
		boolean b1=false;
		
		// 5. String : its not a data type, it is a Class , we can use it as datatype for string type 
		
		String a="AA";
		String s="Hello all";
		String s1="10000000";
		// String concatenation
		System.out.println(a+s1);
		
		
		
		
		
		
	}

}
