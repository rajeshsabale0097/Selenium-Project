package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex4_Vector 
{
	public static void main(String[] args)
	{
		Vector V=new Vector();
		V.add("Ranjana");
		V.add(100);
		V.add(55.6f);
		V.add("Vandana");	
		V.add(100);
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		System.out.println(V.capacity());
		System.out.println(V.size());
		System.out.println(V.isEmpty());
		System.out.println(V.contains("Vandana"));
		System.out.println(V.get(4));
		
		
		//add info in betweeen vector-->right shift operation
		System.out.println(V);
		V.add(3,200);
		System.out.println(V);
		
		//remove info in betweeen vector --->left shift operation
		V.remove(4);
		System.out.println(V);
		
		// update or modify in between vector
		V.set(1, "Radha");
		System.out.println(V);
		
		System.out.println("--Print VI info from vector using iterator cursor--");
		Iterator itr = V.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print Vi info from vector using ListIter cursor ");
		ListIterator Litr = V.listIterator();
		
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		System.out.println("-----Print VI data using foe loop---");
		for(int i=0;i<=V.size()-1;i++)
		{
			System.out.println(V.get(i));
		}
		System.out.println("---Print Vi data using foreach loop---");
		for(Object s1:V)
		{
			System.out.println(s1);
		}
		System.out.println("---Print all data using Enemuration---");
		Enumeration enu = V.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
