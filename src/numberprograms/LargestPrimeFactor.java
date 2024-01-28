package numberprograms;

import java.util.Scanner;

public class LargestPrimeFactor {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		 System.out.println(findLargestPrimeFactor(no));
	}

	private static int findLargestPrimeFactor(int no) {
		int i=0;
		for( i=2;i<=no;i++) {
			if(no%i==0) {
				no=no/i;
				i--;
			}
		}
		return i;
	}
}
