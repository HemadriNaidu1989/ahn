package p1;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the any number");
		int n=s.nextInt();
		if(n<0)
      System.out.println("the given number is negative");
		else
			System.out.println("The number is Positive");
			}

}
