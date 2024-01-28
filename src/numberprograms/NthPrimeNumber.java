package numberprograms;

import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int no=sc.nextInt();
		int k=sc.nextInt();
		kthPrimeNumber(no,k);
	}

	private static void kthPrimeNumber(int no,int k) {
		int count=1;
		for(int i=no;i<Integer.MAX_VALUE;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
			if(count==k) {
				System.out.println("The "+k+" th Prime Number is "+i);
				break;
			}
			else {
				count++;
			}
			}
		}
		
	}
}
