package arrayprograms;

public class SmallestMissingPositiveNumber {
    public static void main(String[] args) {
		int[]arr= {3,-2,6,1,0};// or {1,2,3,4,5}
		int size=arr.length-1;
		System.out.println(missingNumber(arr,size));
	}

	private static int missingNumber(int[] arr, int size) {
		for(int i=1;i<arr.length;i++) {
			if(!contain(i,arr)) {
				return i;
			}
		}
		return size;
	}

	private static boolean contain(int k, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				return true;
		}
		return false;
	}
}
