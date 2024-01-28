package stringprograms;

public class PrintingSentenceWithoutUsingLoopsAndSplit {
    public static void main(String[] args) {
		String str="java is easy ";
		char[]ch=str.toCharArray();
		String s="";
		for(char c:ch) {
			if(c!=' ') {
				s+=c;
			}else {
				System.out.println(s);
				s="";
			}
		}
	}
}
