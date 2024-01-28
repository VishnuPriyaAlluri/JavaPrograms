package stringprograms;

public class AAAABBBBBBBCC {
   public static void main(String[] args) {
	String str="AAAABBBBBBBCC";
	//str=str.toLowerCase();
	char[]ch=str.toCharArray();
	int[]arr=new int[123];
	for(int i=0;i<ch.length;i++) {
		arr[ch[i]]++;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.println((char)i+"->"+arr[i]);
		}
	}
}
}
