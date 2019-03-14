package ObjectOrientedProgrammingConcept;

public class CheckingSomeIssues {
	
	

	public static void main(String[] args) {
	
		int x=20;
		int y=6;
		
		double l=20.00;
		double s=6.00;
		
		CheckingSomeIssues obj=new CheckingSomeIssues();
		int k=obj.test1(x, y);
		System.out.println("value of k is:"+k);
		
		double dr=obj.test2(l, s);
		System.out.println("check result now:"+dr);
		
}
	
	public int test1(int a, int b)
	{
		
		int c=a/b;
		return c;
	}
	public double test2(double d, double d1)
	{
		double d2=d/d1;
		return d2;
	}
}

