package ObjectOrientedProgrammingConcept;

public class LocalGlobalPackage {

	
	String name="Ajay Bhardwaj";
	int age=26;
	public static void main(String[] args) {
	
		LocalGlobalPackage obj=new LocalGlobalPackage();
		System.out.println("Name and age of Employee is:"+obj.name+"------and age is---->"+obj.age);

		obj.test();
	}
	public void test()
	{
	
		String name="Monica Vats";
		int age=27;
		System.out.println("Name and age of Employee is:"+name+"-------and age is---->"+age);
		
	}
	
}
