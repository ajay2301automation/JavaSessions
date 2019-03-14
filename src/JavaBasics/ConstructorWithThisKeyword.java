package JavaBasics;

public class ConstructorWithThisKeyword {
	String name; // global variables
	int age;
	
	public ConstructorWithThisKeyword()
	{
		
	}
	
	public ConstructorWithThisKeyword(String namee, int agee)
	{
		this.name=namee;
		this.age=agee;
		
		System.out.println(namee); // Tom
        System.out.println(agee);// 30
		
		
		// here Tom and 30 are given to namee and agee respectively now we want to give values to name and age
	
	this.name=namee;
	this.age=agee;
	System.out.println(name);
	System.out.println(age);
	
	}
	

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj=new ConstructorWithThisKeyword("Tom",30);
		

	}

}
