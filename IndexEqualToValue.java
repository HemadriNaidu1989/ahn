package p1;

import java.util.Scanner;

public class IndexEqualToValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		System.out.println("enter the array values");
		int arr[]=new int[size];
		int status=0;
for(int i=0;i<size;i++)
{
	arr[i]=s.nextInt();
}
for(int i=0;i<size;i++)
{
	if(arr[i]==i)
	{
		status++;
		System.out.println("the number "+arr[i]+" is equal to "+i);
	}
}
if(status==0)
{
	System.out.println("There is no number equal to index");
}

	}

}
