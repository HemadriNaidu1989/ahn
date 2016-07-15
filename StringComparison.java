package p1;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
import java.util.Scanner;  
public class StringComparison {  
public static void main(String args[]) {  
Scanner ta=new Scanner(System.in);  
System.out.println("Enter the String:");  
String str=ta.nextLine();  
System.out.println("enter the length");  
int len=ta.nextInt();
List<String> l=new ArrayList<String>();  
for (int i=0;i<str.length();i = i + 1) 
{  
if (str.length()-i>=len) 
{  
l.add(str.substring(i,len + i));  
}  
}  
Collections.sort(l);  
System.out.println("Largest subString:" + l.get(l.size() - 1));  
}  
}  