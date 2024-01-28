package arrayprograms;

public class SearchingElementInAnArray {
      public static void main(String[] args) {
		int[]arr= {2,1,7,5,9,0,6};
		search(arr,10);
	}
      static boolean search(int[]arr,int no) {
    	  for(int i=0;i<arr.length;i++) {
    		  if(arr[i]==no) {
    			  System.out.println("The "+no+" is present in the index of "+i);
    			  return true;
    		  }
    	  }
    	  System.out.println("The "+no+" is not present in the array");
    	  return false;
      }
}
