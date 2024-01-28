package stringprograms;

import java.util.Scanner;

public class Compare2StringsWithoutUsingEquals {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 strings");
	String str1=sc.next();
	String str2=sc.next();
	if(isEqual(str1,str2)) {
		System.out.println(str1+" "+str2+" are same");
	}else {
		System.out.println(str1+" "+str2+" are not same");
	}
}

private static boolean isEqual(String str1, String str2) {
	if(str1.length()!=str2.length())
		return false;
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)!=str2.charAt(i)) {
			return false;
		}
	}
	return true;
}
}
