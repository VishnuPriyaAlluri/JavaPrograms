package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindNthLargestAndSmallestElement {
     public static void main(String[] args) {
		List<Integer>arr=new ArrayList<Integer>(Arrays.asList(3,9,4,7,1,5,8));
		System.out.println(find(arr,3));
		
	}

	private static List<Integer> find(List<Integer> arr, int k) {
		List<Integer>a=new ArrayList<Integer>();
		Collections.sort(arr);//1 3 4 5 7 8 9
		a.add(arr.get(arr.size()-k));
		a.add(arr.get(k-1));
		return a;
	}
}
