package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex3_LinkedList
{
	public static void main(String[] args) 
	{
		LinkedList LL=new LinkedList();
		
		LL.add("Arati");
		LL.add(100);
		LL.add('S');
		LL.add(74.4f);
		LL.add(null);
		LL.add(null);
		LL.add(100);
		
		System.out.println(LL);
		System.out.println(LL.size());
		System.out.println(LL.isEmpty());
		System.out.println(LL.contains(100));
		System.out.println(LL.get(2));
		
		System.out.println(LL);
	    LL.add(4,500);                 // add info in between LinkedList
	    System.out.println(LL);
	    
	    // Modify or update info
	    LL.set(0, "Radha");
	    System.out.println(LL);
	    
	    System.out.println("----Print all data using itr cursor----");
	    Iterator itr = LL.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next( ));
	    }
	    
	    System.out.println("-------Print all data using Listitr cursor----");
	   ListIterator Litr = LL.listIterator();
	    while(Litr.hasNext())
	    {
	    	System.out.println(Litr.next());
	    }
	    
	    System.out.println("---Print all data using for loop---");
	    for(int i=0;i<=LL.size()-1;i++)
	    {
	    	System.out.println(LL.get(i));
	    }
	    System.out.println("---Print all data using Foreach loop---");
	    for(Object s1:LL)
	    {
	    	System.out.println(s1);
	    }
	    
	    
	    
		

		
	}

}
