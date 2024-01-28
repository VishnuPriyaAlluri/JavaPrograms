package stringprograms;

import java.util.Arrays;

public class SwapFirstAndLastCharacterOfWorld {
     public static void main(String[] args) {
		String str="java is easy";
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int j=i;
			while(i<ch.length && ch[i]!=' ') {
				i++;
			}
			char temp=ch[j];
			ch[j]=ch[i-1];
			ch[i-1]=temp;
			
		}
		System.out.println(Arrays.toString(ch));
	}
}
