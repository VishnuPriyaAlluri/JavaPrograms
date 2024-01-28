package arrayprograms;

public class TransposeMatrixSymmetric {
    public static void main(String[] args) {
		int[][]arr= {{1,2,3},{2,4,5},{3,5,6}};
		if(isSymmetric(arr)) {
			System.out.println("Symmetric Matrix");
		}else {
			System.out.println("non Symmetric Matrix");
		}
		
	}

	private static boolean isSymmetric(int[][] arr) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]!=arr[col][row])
					return false;
			}
		}
		return true;
	}
}
