package arrayprograms;

public class ArrayLeftRotation {
    public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int k=10;
		k=k%arr.length;
		for(int i=0;i<arr.length;i++) {
			if(i<(arr.length-k)) {
				System.out.print(arr[i+k]+" ");
			}else {
				System.out.print(arr[i+k-arr.length]+" ");
			}
		}
	}
}
