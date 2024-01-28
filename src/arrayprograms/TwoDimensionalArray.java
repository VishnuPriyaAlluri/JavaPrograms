package arrayprograms;

public class TwoDimensionalArray {
    public static void main(String[] args) {
    	
    	//printing 2D Array
//		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
    	
    	//searching an element in 2D Array
//    	String[][]arr= {{"dharmaraya","arjuna","bheema"},{"nakula","sahadev","karna"},{"dhuryodana","bheeshma","krishna"}};
//    	for(int i=0;i<arr.length;i++) {
//    		for(int j=0;j<arr[i].length;j++) {
//    			if(arr[i][j]=="dhuryodana") {
//    				System.out.println("Dhuryodana is in "+i+" row "+j+" col ");
//    			}
//    		}
//    	}
    	
    	//sum of diagonal array
//    	int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
//    	int sum=0;
//    	for(int i=0;i<arr.length;i++) {
//    		sum+=arr[i][i];
//    	}
//    	System.out.println("The sum of diagonal array is "+sum);
    	
    	//sum of antidiagonal array
    	int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum+=arr[i][arr.length-1-i];
    	}
    	System.out.println("The sum of anti diagonal array is "+sum);
	}
}
