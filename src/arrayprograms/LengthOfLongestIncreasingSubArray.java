package arrayprograms;

public class LengthOfLongestIncreasingSubArray {
     public static void main(String[] args) {
		int[]arr= {1,2,3,2,5,7,2,4,6};
		int longestLength=findLongestLength(arr);
		System.out.println(longestLength);
	}

	private static int findLongestLength(int[] arr) {
		int currentLength=1;
		int maxLength=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				currentLength++;
			}else
				currentLength=1;
		}
//		System.out.println(currentLength);
//		System.out.println(maxLength);
		maxLength=Math.max(maxLength, currentLength);
		return maxLength;
	}
	
}
