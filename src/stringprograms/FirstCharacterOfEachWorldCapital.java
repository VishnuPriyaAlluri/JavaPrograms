package stringprograms;

import java.util.Arrays;

public class FirstCharacterOfEachWorldCapital {
    public static void main(String[] args) {
		String str="hi java how are you";
		char[]ch=str.toCharArray();
		ch[0]=(char)(ch[0]-32);
		//System.out.println(ch[0]);
		for(int i=1;i<ch.length;i++) {
			if(ch[i]==' ') {
				ch[i+1]=(char)(ch[i+1]-32);
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
