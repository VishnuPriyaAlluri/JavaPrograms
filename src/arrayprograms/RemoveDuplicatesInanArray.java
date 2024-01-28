package arrayprograms;

import java.util.TreeSet;

public class RemoveDuplicatesInanArray {
     public static void main(String[] args) {
		int[]arr= {3,1,7,6,2,5,3,7,5,3,9};
		TreeSet<Integer> t1=new TreeSet<Integer>();
		for(int no:arr) {
			t1.add(no);
		}
		System.out.println(t1);
	}
}
