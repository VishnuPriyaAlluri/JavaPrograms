package arrayprograms;

public class SecondLargestElementArray {
      public static void main(String[] args) {
		int[]arr= {3,2,5,1,4,6};
		int fl=0;
		int sl=0;
		for(int i=0;i<arr.length;i++) {
			if(fl<arr[i]) {
				sl=fl;
				fl=arr[i];
			}else if(sl<arr[i]) {
				sl=arr[i];
			}
		}
		System.out.println(sl);
	}
}
