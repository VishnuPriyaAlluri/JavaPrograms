package stringprograms;

import java.util.Scanner;

public class HighestFrequencyOfCharacterInString {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	findFrequency(str);
}

     private static void findFrequency(String str) {
    	 int[]arr=new int[123];
	     char[]ch=str.toCharArray();
	     for(char c:ch) {
	    	 arr[c]++;
	     }
	     int max=-1;
	     char c=' ';
	    for(int i=0;i<str.length();i++) {
	    	if(max<arr[str.charAt(i)]) {
	    		max=arr[str.charAt(i)];
	    		c=str.charAt(i);
	    	}
	    }
	     System.out.println(c+"->"+max);
	
     }
}
