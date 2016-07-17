package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstRepeatNumber
{



			public static void main(String[] args)
			{
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
if(m.put(arr[i],arr[i])==null)
{
	
}
else
{
	System.out.println("First repeating Number is : "+arr[i]);
	break;
}
}

	}

}
