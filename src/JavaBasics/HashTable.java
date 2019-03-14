package JavaBasics;

import java.util.Hashtable;


public class HashTable {

	public static void main(String[] args) {
		
	Hashtable h= new Hashtable(); // note the difference
	h.put(2, 234);
	System.out.println("value of hash"+h.get(2));
	h.put(3,344);
	h.put(4, 2354);
	h.put(5, 678);
	System.out.println(" size of hash:"+h.size());
	for(int i =0; i<h.size();i++)
	{
		System.out.println(h.get(i));
	}
		
		Hashtable<String, Integer> h1=new Hashtable<String, Integer>();
		h1.put("A", 234);
		System.out.println(h1.get("A"));
		h1.clear();
		System.out.println(h1.get("A"));
		

	}

}
