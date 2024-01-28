package stringprograms;

import java.util.Scanner;

public class FindingLengthOfStringWithoutUsingLengthMethod {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.next();
	finding(str);
}

private static void finding(String str) {
	int length=0;
	char[]ch=str.toCharArray();
	for(char c:ch) {
		length++;
	}
	System.out.println(length);
	
}
}
