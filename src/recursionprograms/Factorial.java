package recursionprograms;

import java.util.Scanner;

public class Factorial {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("emter number");
		int no=sc.nextInt();
		System.out.println(factorial(no));
    	  
	}

	private static int factorial(int no) {
		if(no==0)
			return 1;
		else {
			return no*factorial(no-1);
		}
	}
}
