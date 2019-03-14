package ObjectOrientedProgrammingConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// string to integer
		
		String x ="100"; // this will be treated as String
		System.out.println(x+20); // it will not give 120, it will give 10020 as output
		// now we want to convert this 100 from string to integer
		
	int k=	Integer.parseInt(x); // Interger is wrapper class 
	System.out.println(k+200); // not it will give you 300 as output
	
	
	// if we will try to convert "100A" to integer
	
	/*String t="100A"; // its a string 
	int r=Integer.parseInt(t);
	System.out.println(r); // it will give us NumberFormatException
	*/
	
	// Integer, Double, Character , Boolean
	
	//String to double
	
	String y ="100.355";
	System.out.println(y+48);
	double d=Double.parseDouble(y);
	System.out.println(d+477);
	
	// String to boolean
	
	String l="true";
	Boolean.parseBoolean(l);
	boolean b= Boolean.parseBoolean(l);
	System.out.println(b);
	
	
	//int to String
	
	int j=200;
	System.out.println("addition of number is:"+(j+488)); // it will give you direct addition of number
	// now we wan to convert this j in String
	
	String.valueOf(j);
	String s= String.valueOf(j);
	System.out.println("concatenated string is:"+(s+488)); // it will give you string concatenation
	
		

	}

}
