package stringprograms;

public class A2B4C1 {
   public static void main(String[] args) {
	String str="A2B4C1";
	str=str.toLowerCase();
	char[]ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='0' && ch[i]<='9') {
			print(ch[i],ch[i-1]);
		}
	}
}

    private static void print(char ch1, char ch2) {
	
	    int no=(int)(ch1-48);
	    //System.out.println(no);
	    for(int i=1;i<=no;i++) {
	    	System.out.print(ch2);
	    }
    }
}
