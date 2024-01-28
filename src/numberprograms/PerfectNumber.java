package numberprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int no=sc.nextInt();
//		if(isPerfect(no)) {
//			System.out.println(no+" is perfect number");
//		}else
//			System.out.println(no+" is not a perfect number");
		
		System.out.println("enter two numbers");
		rangeOfPerfect(sc.nextInt(),sc.nextInt());
		
	}

	private static void rangeOfPerfect(int lower, int higher) {
		
		for(int i=lower;i<=higher;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i)
				System.out.println(i+" is perfect number");
		}
	}

	private static boolean isPerfect(int no) {
		int sum=0;
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				sum+=i;
			}
		}
		return sum==no;
	}
}
