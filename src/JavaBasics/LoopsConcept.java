package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// while loop
		int i=1; // initialization 
		int j=1;
		 
		while(i<=10) // condition
		{
			System.out.println("value of i is:"+i);
			i++; // incremental or decremental part
			
			// if increment is not there it will go infinite
			
		}
		
		System.out.println("*******************next loop*********************");

		//for loop // or we can write j++
		
	/*	for(j=1; j<=20; j++);
		
			System.out.println(j);
		*/
		
		for(j=1;j<=20;j++)
		{
			System.out.println(" Value of j is:"+j);
		}
		System.out.println("***************************");
		
		// printing from 10 to 1
		for(int k=10;k>=-10;k=k-1) // we also use condition as k>=1
		{
			System.out.println("value of k is:"+k);
		}
		
		
	}

}
