package stringprograms;

import java.util.Arrays;

public class ReverseWordsOfSentence {
     public static void main(String[] args) {
		String str="hi hello how are you ";
//		String s[]=str.split(" ");
//		reverse(s);
		
		char[]ch=str.toCharArray();
		String[]s=new String[10];
		int k=0;
		String rev="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				rev=rev+ch[i];
			}else {
				s[k++]=rev;
				rev="";
			}
		}
		System.out.println(Arrays.toString(s));
		reverse(s);
	}

	private static void reverse(String[] s) {
		for(int i=s.length-1;i>=0;i--) {
			if(s[i]!=null)
			System.out.print(s[i]+" ");
		}
		
	}
}
