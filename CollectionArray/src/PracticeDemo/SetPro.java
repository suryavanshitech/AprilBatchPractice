package PracticeDemo;

import java.util.ArrayList;
public class SetPro 
{
	public static void main(String[] args) 
	{
		//HashSet<Integer> hs=new HashSet<Integer>();
		
		//TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//TreeSet<Integer> ts=new TreeSet<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(78);
		al.add(87);
		al.add(78);
		al.add(54);
		al.add(89);
		al.add(7);
		
		int sum=0;
		for(int num: al)
		{
			
			sum +=num;
		}
		float average=0;
		
		if(!al.isEmpty())
		{
			
			average=(float) sum/al.size();
			
			System.out.println(average);
		}
		
	}

}

