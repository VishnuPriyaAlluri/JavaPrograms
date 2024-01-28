package stringprograms;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		if(palin(sc.next())) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

	private static boolean palin(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
