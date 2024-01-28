package stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberOfVowelsInString {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		//System.out.println(countOfVowels(str));
		//order(str);
		nextVowel(str);
	}
     static int countOfVowels(String str) {
//    	 int vowels=0;
//    	 int consonents=0;
//    	 for(int i=0;i<str.length();i++) {
//    		 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
//    			 vowels++;
//    		 else
//    			 consonents++;
//    	 }
//    	 System.out.println(consonents);
//    	 System.out.println(vowels);
//    	 return vowels;
    	 
    	 List<Character> list=new ArrayList(Arrays.asList('a','e','i','o','u'));
    	 
    	 char[]ch=str.toCharArray();
    	 int vowels=0;
    	 for(char c:ch) {
    		 if(list.contains(c))
    			 vowels++;
    	 }
    	 return vowels;
     }
     
     static void order(String str) {
    	 List<Character> list=new ArrayList(Arrays.asList('a','e','i','o','u'));
    	 char[]ch=str.toCharArray();
    	 String vowels="";
    	 String consonents="";
    	 for(char c:ch) {
    		 if(list.contains(c))
    			 vowels+=c;
    		 else
    			 consonents+=c;
    	 }
    	 System.out.println(vowels+" "+consonents);
     }
     
//     static void nextVowel(String str) {
//    	 
//    	 char[]ch=str.toCharArray();
//    	 for(int i=0;i<ch.length;i++) {
//    		char c=ch[i];
//    		if(c>='a' && c<'e')
//    			System.out.println('e');
//    		if(c>='e' && c<'i')
//    			System.out.println('i');
//    		if(c>='i' && c<'o')
//    			System.out.println('o');
//    		if(c>='o' && c<'u')
//    			System.out.println('u');
//    		if(c>='u' && c<'a')
//    			System.out.println('a');
//    	 }
//    
//     }
     
     static void nextVowel(String str) {
    	 List<Character> list=new ArrayList(Arrays.asList('a','e','i','o','u'));
    	 char[]ch=str.toCharArray();
    	 for(int i=0;i<ch.length;i++) {
    		 int no=(int) ch[i];
    		 if(no>=(int) 'a' && no<(int) 'e')
    		 {
    			 System.out.println('e');
    		 }
    		 if(no>=(int) 'e' && no<(int) 'i')
    		 {
    			 System.out.println('i');
    		 }
    		 if(no>=(int) 'i' && no<(int) 'o')
    		 {
    			 System.out.println('o');
    		 }
    		 if(no>=(int) 'o' && no<(int) 'u')
    		 {
    			 System.out.println('u');
    		 }
    		 if(no>=(int) 'u' || no<(int) 'a')
    		 {
    			 System.out.println('a');
    		 }
    	 }
    	 
     }
}
