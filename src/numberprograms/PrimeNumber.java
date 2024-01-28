package numberprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		if(isPrime(sc.nextInt())) {
			System.out.println("Prime number");
		}else {
			System.out.println("not a prime number");
		}
	}

	private static boolean isPrime(int no) {
		boolean flag=true;
		for(int i=2;i<no;i++) {
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
