package stringprograms;

import java.util.Arrays;

public class A10B12C7 {
   public static void main(String[] args) {
	String str="a10b12c7";
	String str1=str.replaceAll("[0-9]","");
	String[]s1=str1.split("");
	System.out.println(Arrays.toString(s1));//[a,b,c]
	String str2=str.replaceAll("[a-zA-Z]"," ");
	//System.out.println(str2);
	String[]s2=str2.split(" ");
	System.out.println(Arrays.toString(s2));//[,10,12,7]
	for(int i=1;i<s2.length;i++) {
		int no=Integer.parseInt(s2[i]);
		print(no,s1[i-1]);
	}
	
	
}

private static void print(int no, String s1) {  //10 a
	
	for(int i=1;i<=no;i++) {
		System.out.print(s1);
	}
	
	
}
}
