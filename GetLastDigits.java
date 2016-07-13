package p1;

import java.util.Scanner;

public class GetLastDigits 
{
	static int arr_num[];
static int num_len;
	public static void main(String[] args) 
	{
		
		String str_num="";
		int key,int_num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		try
		{
		int_num=s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter the valid number");
			System.exit(0);
		}
		System.out.println("Please enter number of digits u want to remove");
		key=s.nextInt();
		String sl=""+int_num;
		num_len=sl.length();
		arr_num=new int[num_len];
		int r=0,j=0;
		while(int_num>0)
		{
		r=int_num%10;
		arr_num[j++]=r;
		int_num/=10;
		}
		sortElements();
		String final_num="";
		for(int i=0;i<num_len-key;i++)
		{
			final_num+=""+arr_num[i];
		}
		System.out.println(final_num);
	}
public static void sortElements()
{
	int t=0;
	for(int i=0;i<num_len-1;i++)
	{
	for(int j=i+1;j<num_len;j++)
	{
	if(arr_num[i]>arr_num[j])
	{
	t=arr_num[i];
	arr_num[i]=arr_num[j];
	arr_num[j]=t;
	}
	}
	}	}
}

