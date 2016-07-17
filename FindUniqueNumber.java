package p1;

import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class FindUniqueNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		System.out.println("enter the array values");
		Map<Object,Object> m=new HashMap<Object,Object>();
		int count=1;
		int t=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
		  if(m.put(arr[i], count)==null)
		{
			
		}
		else
		{
			count=(int)m.get(arr[i]);
			count++;
			m.put(arr[i], count);
		}
		  count=1;
		}
		System.out.println("Unique Numbers are");
		for(int i=0;i<size;i++)
		{
			count=(int)m.get(arr[i]);
			if(count==1)
			{
				System.out.print("-"+arr[i]);
			}
		}
		
	}

}
