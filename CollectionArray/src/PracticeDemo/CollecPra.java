package PracticeDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class CollecPra 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(101);
		al.add(12);
		al.add(101);
		al.add(12);
		al.add(87);
		
		Iterator<Integer> i= al.iterator();
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
	}

}
