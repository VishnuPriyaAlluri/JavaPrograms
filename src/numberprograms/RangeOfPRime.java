package numberprograms;

import java.util.Scanner;

public class RangeOfPRime {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		primeBetween(sc.nextInt(),sc.nextInt());
	}

	private static void primeBetween(int smallest, int largest) {
		
		for(int i=smallest;i<=largest;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i+" is prime number");
				break;//for next prime number
			}
		}
	}
}
