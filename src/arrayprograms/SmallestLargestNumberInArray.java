package arrayprograms;

import java.util.Arrays;

public class SmallestLargestNumberInArray {
     public static void main(String[] args) {
		int[]arr= {7,2,9,1,5,4,6,8,3};
//		Arrays.sort(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[arr.length-1]);
		
		find(arr);
	}
     static void find(int[]arr) {
    	 int fl=0;
    	 int fs=Integer.MAX_VALUE;
    		 
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]>fl) {
    			 fl=arr[i];
    		 }
    		 if(arr[i]<fs) {
    			 fs=arr[i];
    		 }
    	 }
    	 System.out.println(fl);
    	 System.out.println(fs);
     }
}
