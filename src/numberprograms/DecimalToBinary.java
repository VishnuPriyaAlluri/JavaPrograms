package numberprograms;

import java.util.Scanner;

public class DecimalToBinary {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		convertBinary(no);
	}

	private static void convertBinary(int no) {
		String binary="";
		while(no!=0) {
			int rem=no%2;
			binary=rem+binary;
			no=no/2;
		}
		System.out.println(binary);
		
	}
}
