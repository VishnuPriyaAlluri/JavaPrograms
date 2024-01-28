package arrayprograms;

public class FrequencyOfElementsGreaterThanArrayHalfLEngthMajority {
      public static void main(String[] args) {
    	  int[]arr= {2,3,9,2,2};//{8,8,8,8,8,9,1}
    	  System.out.println(counting(arr));
		
	}

	private static int counting(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				return arr[i];
			}
		}
		return -1;
	}
}
