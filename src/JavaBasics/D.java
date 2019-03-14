package JavaBasics;

public class D {
	
	public D() {
		System.out.println("Default constructor");
	}
	
	public D(int i)
	{
		System.out.println("1 paramter constructor:"+i);
	}

	public static void main(String[] args) {
		
 D obj=new D();
 D obj1=new D(80);
	}

}
