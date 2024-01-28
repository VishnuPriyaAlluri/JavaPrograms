package conceptprograms;

import java.util.Scanner;

public class AreaOfCircle {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius of circle");
	System.out.println(area(sc.nextInt()));
}

    private static double area(int r) {
	      final double pi=3.14;
	      double a=pi*r*r;
	      return a;
    }
}
