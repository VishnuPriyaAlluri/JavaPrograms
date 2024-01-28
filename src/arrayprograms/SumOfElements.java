package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElements {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int[]arr=new int[sc.nextInt()];
	 int index=0;
	 for(int i=0;i<arr.length;i++) {
		 System.out.println("enter array elements");
		 arr[index++]=sc.nextInt();
		 
	 }
	 System.out.println(Arrays.toString(arr));
	 System.out.println(sumOf(arr));
}

private static int sumOf(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	return sum;
}
}
