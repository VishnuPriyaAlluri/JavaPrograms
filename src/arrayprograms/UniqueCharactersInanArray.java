package arrayprograms;

public class UniqueCharactersInanArray {
   public static void main(String[] args) {
	int[]arr= {3,1,7,3,9,6,8,5,4,3,2,5,1};
	for(int i=0;i<arr.length;i++) {
		boolean flag=true;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j] && i!=j) {
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(arr[i]);
	}
}
}
