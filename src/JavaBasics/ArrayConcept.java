package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//int i=20;
	// 	int i=10; it is not allowed
	//	i=10 it is allowed.
		// at a time we can store 1 value in single variable
		// array: to store similar data type values in a array variable
		
	// int array
		
		int i[]=new int[4]; // now we can store 4 values in this array, 4 memory blocks will be created address of these blocks will be starting from 0 to 3
		
// i will be divided into 4 parts, i0,i1,i2,i3
		
		//highest index/bound is 3 (4-1) and lowest index/bound is 0
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
	//	System.out.println(i[4]); it will give ArrayIndexOutOfBoundException
		System.out.println(i.length); // it will give length of Array
		
		//print all the values of Array
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println("Value of Array:"+i[j]);
		}
		
		// double Array
		
		double d[]=new double[5];
		d[0]=45.45;
		d[1]=67.99;
		d[2]=56.45;
		d[3]=56.12;
		
		System.out.println("value of sum:"+(d[0]+d[3]));
		
		System.out.println("***********************************");
		for( int k=0; k<d.length;k++)
		{
			System.out.println("value of double array:"+d[k]);
			
		}
		
		
		// disadvantages of Array:
		
	//1.size is fixed -- it is called static array-- to overcome we use collection like Arraylist or Hashtable(Dynamic Array)
		System.out.println("Static Array, its Disadvantage");
		//2. Stores only similar data types ---- to over this issue we use Object array
		System.out.println("Stores only similar data types");
		
		//Object array
		// Object is super class of all  the classed.
		
		Object ob[]=new Object[6];
		
		ob[0]="Tom";
		ob[1]=23;
		ob[2]=23.34;
		ob[3]='M';
		ob[4]="14/01/2018";
		ob[5]="India";
		System.out.println(ob[5]);
		
		System.out.println(ob.length);
		
		for(int z=0;z<ob.length;z++)
		{
			System.out.println("values in Object Array:"+ob[z]);
		}
		
		
		// two dimensional array
		
		int l[][]= new int[3][5];
		l[0][0]=1;
		l[0][1]=2;
		l[0][2]=3;
		l[0][3]=4;
		l[0][4]=5;
		l[1][0]=6;
		l[1][1]=7;
		l[1][2]=8;
		l[1][3]=9;
		l[1][4]=10;
		l[2][0]=11;
		l[2][1]=12;
		l[2][2]=13;
		l[2][3]=14;
		l[2][4]=15;
		
		
		System.out.println("value of array is :"+l[2][2]);
		System.out.println(l.length); // it will give number of rows
		System.out.println(l[0].length);// it will number of columns
		System.out.println(l[0].length);
		
		System.out.println("printing all the values of 2 D Array");
		// print all the value of 2 D array : use for loop
		for(int r=0;r<l.length;r++)
		{
			for(int h=0; h<l[0].length;h++) {
				System.out.println(l[r][h]);
		}
		
		}
		
		System.out.println("again trying by my own");
		
		for(int row=0; row<l.length;row++) // row<l.length is condition as l.lenght will give 3, and it will satisfy the condition as we have rows starting from 0to 2
		{
			for(int col=0; col<l[0].length;col++)
			{
				System.out.println("values of array are:"+l[row][col]);
			}
		}
		
		System.out.println("trying again");
		for(int rows=0;rows<l.length;rows++)
		{
			for( int cols=0;cols<l[0].length;cols++)
			{
				System.out.println("values are:"+ l[rows][cols]);
			}
	
			}
	}

}
