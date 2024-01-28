package stringprograms;

public class SubStrings {
    public static void main(String[] args) {
		String str="knowledge";//ledgewonk
		String s=str.substring(4);//ledge
		String firstPart=str.substring(0,4);//know
		String rev=new StringBuilder(firstPart).reverse().toString();
		System.out.println(rev);
		//System.out.println(rev+""+s);
	}
}
