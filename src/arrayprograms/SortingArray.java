package arrayprograms;

import java.util.Arrays;

public class SortingArray {
      public static void main(String[] args) {
		int[]arr= {3,5,1,4,2};
		sort(arr);
	}

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) { 
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
