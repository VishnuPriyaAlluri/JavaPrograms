package stringprograms;

public class Hello {
   public static void main(String[] args) {
	String str="hello";//llollollo elloelloelloello lolo
	//print(str,2);
	//print(str,3);
	print(str,4);
}

private static void print(String str, int no) {
	for(int i=no;i>0;i--) {
		System.out.print(str.substring(str.length()-no));
	}
	
}
}
