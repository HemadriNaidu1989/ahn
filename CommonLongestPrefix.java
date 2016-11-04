package p1;

import java.util.Scanner;

public class CommonLongestPrefix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		System.out.println("enter the array values");
		String strarr[]=new String[size];
		for(int i=0;i<size;i++)
		{
		strarr[i]=s.next();
		}
		System.out.println(commonPrefix(strarr));
	}
	public static String commonPrefix(String[] strs) {
		    String longestPrefix = "";
		    if(strs.length>0){
		        longestPrefix = strs[0];
		    }
		    for(int i=1; i<strs.length; i++){
		        String analyzing = strs[i];
		        int j=0;
		        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
		            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
		                break;
		            }
		        }
		        longestPrefix = strs[i].substring(0, j);
		    }
		    return longestPrefix;
		}
}