package stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two strings");
	String str1=sc.next();
	String str2=sc.next();
	if(anagram(str1,str2)) {
		System.out.println("anagram");
	}else {
		System.out.println("not an anagram");
	}
}

private static boolean anagram(String str1, String str2) {
	if(str1.length()==str2.length()) {
		
		char[]ch1=str1.toCharArray();
		char[]ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
//		return Arrays.equals(ch1,ch2);
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;
		
	}else {
		return false;
	}
}
}
