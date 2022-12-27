package Collection;

import java.util.ArrayList;


public class ex1_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		

		int capacity = 10;
	    al.add("Rajesh");
		al.add(101);
		al.add('A');
		al.add(65.5f);
		al.add(null);
		al.add(null);
	
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(101));
		System.out.println(al.get((3)));
		
		
				
	}

}
