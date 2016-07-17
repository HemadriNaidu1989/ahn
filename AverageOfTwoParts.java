package p1;

import java.util.Scanner;

public class AverageOfTwoParts {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		System.out.println("enter the array values");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int mid=0;
		if(arr.length%2==0)
		{
		mid=arr.length/2;
		mid--;
		}
		else
		{
		mid=arr.length/2;
		}
		
		int sum=0,sum1=0,avg1=0,avg2=0;
		for(int i=0;i<=mid;i++)
		{
			sum+=arr[i];
		}
		if(arr.length%2!=0)
			avg1=sum/((arr.length/2)+1);
		else
			avg1=sum/(arr.length/2);
		for(int i=mid+1;i<arr.length;i++)
		{
			sum1+=arr[i];
		}
	//	if(arr.length/2==0)
		avg2=sum1/(arr.length/2);
	
		if(avg1==avg2)
			System.out.println("average of two parts of array is equal");
		else
			System.out.println("average of two parts of array is not equal");
	}

}
