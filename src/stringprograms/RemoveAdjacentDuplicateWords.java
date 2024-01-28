package stringprograms;

import java.util.Arrays;

public class RemoveAdjacentDuplicateWords {
   public static void main(String[] args) {
	String str="Bangalore Bangalore Bangalore is Bangalore Bangalore my city  ";
	char[]ch=str.toCharArray();
	String[] s=new String[10];
	String rev="";
	int k=0;
	for(char c:ch) {
		if(c!=' ') {
			rev+=c;
		}else {
			s[k++]=rev;
			rev="";
		}
	}
	//System.out.println(Arrays.toString(s));
	for(int i=0;i<s.length;i++) {
		if(s[i]!=null && s[i+1]!=null)
		if(!removeDuplicates(s[i],s[i+1])) {
			System.out.print(s[i]+" ");
		}
	}
}

private static boolean removeDuplicates(String str1, String str2) {
	if(str1.length()!=str2.length())
		return false;
	for(int i=0;i<str1.length();i++) {
		if(str1.length()!=str2.length())
			return false;
	}
	return true;
}
}
