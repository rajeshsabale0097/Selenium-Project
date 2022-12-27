package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ex_6_LinkedHashSet
{
	public static void main(String[] args)
	{
		 LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Rajesh");
		lhs.add(200);
		lhs.add(null);
		lhs.add('F');
		lhs.add(8.4f);
		lhs.add(null);
		lhs.add("Gajanan");
		lhs.add(200);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(200));
		
		
		//remove info from lhashset
		lhs.remove('F');
		System.out.println(lhs);
		
		System.out.println("---Print all data from Lhashset using itr cursor--");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data from lHahSet using foreach---");
		for(Object s2:lhs)
		{
			System.out.println(s2);
		}
		  

	}
}
