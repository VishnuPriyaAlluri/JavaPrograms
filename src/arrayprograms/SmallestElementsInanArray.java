package arrayprograms;

public class SmallestElementsInanArray {
    public static void main(String[] args) {
		int[]arr= {3,2,1,7,4,9,6,8,5};
		int fs=Integer.MAX_VALUE,ss=Integer.MAX_VALUE,ts=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<fs) {
				ts=ss;
				ss=fs;
				fs=arr[i];
			}else if(arr[i]<ss) {
				ts=ss;
				ss=arr[i];
			}else if(arr[i]<ts) {
				ts=arr[i];
			}
		}
		System.out.println(fs+" "+ss+" "+ts);
	}
}
