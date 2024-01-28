package recursionprograms;

import java.util.Scanner;

public class ReverseAString {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.next();
	System.out.println(reverse(str));
}

private static String reverse(String str) {
	if(str.isEmpty())
		return str;
	else {
		return reverse(str.substring(1))+str.charAt(0);
	}
	
}
}
