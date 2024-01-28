package recursionprograms;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		System.out.println(sumOf(no));
	}

	private static int sumOf(int no) {
		if(no<=0) {
			return 0;
			
		}else if(no%2==1) {
			return no+sumOf(no-2);
		}else {
			return sumOf(no-1);
		}
	}
}
