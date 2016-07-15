package p1;

import java.util.Scanner;

public class SeedNumber 
{

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("enter the seed number");
int seedNumber=s.nextInt();

for(int i=1;;i++)
{
	int ret_val=process(i);
	if(ret_val==seedNumber)
	{
	System.out.println("the number is:"+i);	
	break;
	}
}

	}
	public static int process(int i)
	{
		int temp=i;
		int rev=0;
		while(temp!=0)
		{
			rev=temp%10;
			i=i*rev;
			temp=temp/10;
		}
		return i;
	}

}
