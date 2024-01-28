package numberprograms;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		System.out.println(sumOf(sc.nextInt()));
	}

	private static int sumOf(int no) {
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum+=rem;
			no=no/10;
		}
		return sum;
		
	}
}
