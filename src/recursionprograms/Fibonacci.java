package recursionprograms;

import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int no=sc.nextInt();
	System.out.println(fibonacci(no));
}

private static int fibonacci(int no) {
	if(no==0)
		return 0;
	else if(no==1 || no==2) {
		return 1;
	}
		else {
			return fibonacci(no-1)+fibonacci(no-2);
		
		}
	}
}

