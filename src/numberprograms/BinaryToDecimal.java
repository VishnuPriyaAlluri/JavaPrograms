package numberprograms;

import java.util.Scanner;

public class BinaryToDecimal {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number");
		int no=sc.nextInt();
		convertDecimal(no);
	}

	private static void convertDecimal(int no) {
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum+=Math.pow(2, rem);
			no=no/10;
		}
		System.out.println(sum);
		
	}
}
