package stringprograms;

import java.util.Scanner;

public class ReverseAString {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		//System.out.println(reverse(sc.next()));
		if(reverse(sc.next())) {
			System.out.println("palindrome");
		}else
			System.out.println("not a palindrome");
	}

	private static boolean reverse(String str) {
		String rev="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
		
//		char[]ch=str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			rev+=ch[i];
//		}
		
		int i=str.length()-1;
		while(i>=0) {
			rev+=str.charAt(i--);
		}
		System.out.println(rev);
		return str.equals(rev);
	}
}
