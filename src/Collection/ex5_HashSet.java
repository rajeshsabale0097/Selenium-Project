package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class ex5_HashSet 
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		
		hs.add("Rajesh");
		hs.add(200);
		hs.add(null);
		hs.add('F');
		hs.add(8.4f);
		hs.add(null);
		hs.add("Gajanan");
		hs.add(200);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("Gajanan"));
		System.out.println(hs.isEmpty());
		
		// remove info from hashset
		hs.remove(3);
		System.out.println(hs);
		
		System.out.println("---Print all data from HashSet Using Iterator---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print data from HashSet Using foreach---");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		
	}

}
