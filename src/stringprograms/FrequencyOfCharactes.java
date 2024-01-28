package stringprograms;

public class FrequencyOfCharactes {
    public static void main(String[] args) {
		String str="hello hi how are you";
		int[]arr=new int[123];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+"->"+arr[i]);
			}
		}
	}
}
