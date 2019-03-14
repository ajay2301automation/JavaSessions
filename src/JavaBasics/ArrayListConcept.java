package JavaBasics;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// its dynamic in nature, we can add the values anytime
		
ArrayList ar=new ArrayList(); // note the difference
ar.add(200);
ar.add(2008);
ar.add(6788);
ar.add(343);

System.out.println(ar.size());
ar.add(78);
ar.add(34343);
ar.add(-45);
System.out.println(ar.size());
ar.add("tom");
ar.add(34.55);
ar.add('A');
ar.add("ajay");
ar.add(234);
System.out.println("size if Arraylist:"+ar.size());
ar.remove(5);
System.out.println("new size if ArrayList :"+ar.size());

for(int i=0; i<ar.size(); i++)
{
	System.out.println("values of ArrayList:" +ar.get(i));
}

for(int j=0; j<ar.size();j++)
{
	System.out.println("New Values in Arraylist:"+ar.get(j));
}

// now we want that our arraylist should accept integer type value only
ArrayList<Integer> ar1=new ArrayList<Integer>();
ar1.add(988709);
//ar1.add("aaaa"); we are getting error as our ArrayList is only for Integer
ar1.add(34);

System.out.println("size if ArrayList:"+ar1.size());
for(int k=0; k<ar1.size();k++)
{
	System.out.println(" Value of ArrayList is:"+ar1.get(k));
}


	}

}
