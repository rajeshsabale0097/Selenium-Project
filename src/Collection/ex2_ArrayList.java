package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex2_ArrayList 
{
	public static void main(String[] args) 
	{
		
		ArrayList z= new ArrayList();
	    int capacity = 7;
		z.add("Rajesh");
		z.add("Rahul");
		z.add(100);
		z.add(65.3);
		z.add(null);
		z.add(null);
		z.add("Raju");
		z.add(2);
		z.add("Hello");
		z.add('A');
		
		System.out.println(z);
		System.out.println(z.size());
		System.out.println(z.isEmpty());
		System.out.println(z.contains(65.3));
		System.out.println(z.get(4));
		
		//add info in between array list---> Right shift operatio
		System.out.println(z);
        z.add(4,"Gaju");
        System.out.println(z);
        
        
        //Remove info inbetween ArrayList--->Left Shift Operation
        z.remove(4);
        System.out.println(z);    
        
        
        //update/info from arrayList
        z.set(1, "Ramanujan");
        System.out.println(z);
        
        
        System.out.println("--Print all info from array list using iterator cursor");
        Iterator itr=z.iterator();
        while(itr.hasNext());       //true false
        {
        	System.out.println(itr.next());
        	
        }
        
        System.out.println("--Print All Data From arraylist using listiterator cursor ");
       ListIterator Litr = z.listIterator();
       while(Litr.hasNext())
    	   {
    	   System.out.println(Litr.next());
    	   }
       
       System.out.println("--Print all data using for loop");
       for(int i=0;i<=z.size()-1;i++)
       {
    	   System.out.println(z.get(i));
    	   
       }
       System.out.println("--Print all data from arraylist using foreach loop ");
       for(Object s1:z)
       {
    	   System.out.println(s1);
       }
       
       
       
       
        
        
        
        
		
		
		
		
	}

}
