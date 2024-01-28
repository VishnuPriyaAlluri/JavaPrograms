package stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAStringWithoutUsingBuiltinMethods {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println(reverse(str));
//		int length=str.length()-1;
//		reverse(str,length);
		
	
	}

	private static String reverse(String str) {
			char[]ch=str.toCharArray();
			int start=0,end=str.length()-1;
			while(start<end) {
				char temp=ch[end];
				ch[end]=ch[start];
				ch[start]=temp;
				start++;
				end--;
				
			}
			System.out.println(ch);
			return Arrays.toString(ch);
	}

	private static void  reverse(String str,int length) {
		
		 if(length>=0) {
			 System.out.println(str.charAt(length--));
			 reverse(str,length);
		 }
	}
}
