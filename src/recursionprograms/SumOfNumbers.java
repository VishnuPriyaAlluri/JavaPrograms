package recursionprograms;

import java.util.Scanner;

public class SumOfNumbers {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int no=sc.nextInt();
	System.out.println(sumOf(no));
}

private static int sumOf(int no) {
	  if(no==0) {
		  return 0;
	  }else {
		  return no+sumOf(no-1);
	  }
	}
}
