package numberprograms;

import java.util.Scanner;

public class LeapYear {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if(isLeap(year)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}
	}

	private static boolean isLeap(int year) {
		boolean divBy4=year%4==0;
		boolean divBy100=year%100==0;
		boolean divBy400=year%400==0;
		
		return ((divBy4 && !divBy100) || divBy400);
	}
      
}
