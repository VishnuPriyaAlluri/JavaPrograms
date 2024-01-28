package numberprograms;

import java.util.Scanner;

public class ArmstrongNumber {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		if(isArmstrong(no)) {
			System.out.println(no+" is  Armstrong Number");
		}else {
			System.out.println(no+" is not a Armstrong number");
		}
		
//		System.out.println("enter two numbers");
//		rangeOfArmstrong(sc.nextInt(),sc.nextInt());
	}

	private static boolean isArmstrong(int no) {
		int count=0;
		int sum=0;
		int copy=no;
		int no1=no;
		while(no1!=0) {
			count++;
			no1=no1/10;
		}
		while(no!=0) {
			int rem=no%10;
			sum=sum+power(rem,count);
			no=no/10;
		}
		return sum==copy;
	}

	private static int power(int rem, int count) {
		int pow=1;
		while(count!=0) {
			pow=pow*rem;
			count--;
		}
		return pow;
	}
	
	public static void rangeOfArmstrong(int lower,int higher) {
		for(int i=lower;i<=higher;i++) {
			int no=i;
			int count=0;
			int sum=0;
			int copy=no;
			int no1=no;
			while(no1!=0) {
				count++;
				no1=no1/10;
			}
			while(no!=0) {
				int rem=no%10;
				sum=sum+power(rem,count);
				no=no/10;
				
			}
			if(copy==sum)
				System.out.println(i+" is Armstrong Number");
		}
	}
}
