package arrayprograms;

public class LargestElementsInanArray {
     public static void main(String[] args) {
		int[]arr= {6,1,8,2,7,3,5,4,9};
		int fl=0,sl=0,tl=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fl) {
				tl=sl;
				sl=fl;
				fl=arr[i];
			}else if(arr[i]>sl) {
				tl=sl;
				sl=arr[i];
			}else if(arr[i]>tl) {
				tl=arr[i];
			}
		}
		System.out.println(fl+" "+sl+" "+tl);
	}
}
