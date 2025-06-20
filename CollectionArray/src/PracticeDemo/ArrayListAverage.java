package PracticeDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAverage 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(12);
		al.add(50);
		al.add(78);
		al.add(10);
		al.add(70);
		al.add(2);
		al.add(0);
		
		Iterator<Integer> i= al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		System.out.println("");
		}
		
		int sum=0;
		for(int num:al)			
		{
			sum +=num;
			
			System.out.println(sum);
			System.out.println("");
		}
		double average=0;
		if(!al.isEmpty())
		{
			average=  (double) sum/al.size();
			
			System.out.println(average);
		}

	}

}
