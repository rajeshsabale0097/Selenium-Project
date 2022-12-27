package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex_ArrayList_to_HashSet
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Rahul");
		al.add(50);
		al.add(74.4f);
		al.add(null);
		al.add('A');
		al.add(null);
		
		System.out.println(al);
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
		
		
	}

}
