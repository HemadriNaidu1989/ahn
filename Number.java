import java.io.*;
import java.util.Scanner;
class Number
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the Number");
int num=s.nextInt();
if(num>0)
	System.out.println("positive");
else if(num<0)
	System.out.println("negative");
else
	System.out.println("zero");
	
}
}