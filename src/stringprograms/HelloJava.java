package stringprograms;

import java.util.Arrays;

public class HelloJava {
   public static void main(String[] args) {
	String str="hello java";//avajo lleh
	char[]ch=str.toCharArray();//h,e,l,l,o, ,j,a,v,a
	str=str.replace(" ", "");//hellojava
	int j=str.length()-1;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=' ') {
			ch[i]=str.charAt(j);
			j--;
		}
	}
	System.out.println(Arrays.toString(ch));
	
}
}
