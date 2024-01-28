package numberprograms;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		//int no=sc.nextInt();
		System.out.println(factorial(sc.nextInt()));
	}

	private static int factorial(int no) {
//		int fact=1;
//		for(int i=no;i>=1;i--) {
//			fact=fact*no--;
//		}
//		return fact;
		
		int fact=1;
		while(no!=0) {
			fact=fact*no--;
			
		}
		return fact;
	}
}
