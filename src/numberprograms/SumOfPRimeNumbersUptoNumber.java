package numberprograms;

import java.util.Scanner;

public class SumOfPRimeNumbersUptoNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		sumOf(no);
	}

	private static void sumOf(int no) {
		int sum=0;
		for(int i=1;i<=no;i++) {
			 if(isPrime(i))
				 sum+=i;
		}
		System.out.println(sum);
		
	}

	private static boolean isPrime(int no) {
		boolean flag=true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
