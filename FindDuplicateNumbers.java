package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateNumbers 
{

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("enter the array size");
int size=s.nextInt();
System.out.println("enter the array values");
Map<Object,Object> m=new HashMap<Object,Object>();
int nval=0;
int count=0;
for(int i=0;i<size;i++)
{
nval=s.nextInt();
if(m.put(nval, nval)==null)	
{
	
}
else
{
	count++;
	System.out.print(nval);
}

}
if(count==0)
{
	System.out.println("There are no duplicates");
}
	}

}
