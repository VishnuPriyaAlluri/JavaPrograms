package stringprograms;

import java.util.Set;
import java.util.TreeSet;

public class Panagram {
   public static void main(String[] args) {
	String str="The quick brown fox jumps over the lazy dog";
	str=str.toLowerCase();
	str=str.replaceAll(" ","");
	char[]ch=str.toCharArray();
	Set<Character> s=new TreeSet<Character>();
	for(char c:ch) {
		s.add(c);
	}
	if(s.size()==26) {
		System.out.println("Panagram");
	}else {
		System.out.println("not a panagram");
	}
}
}
