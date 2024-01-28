package numberprograms;

import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		int no1=sc.nextInt();
		System.out.println("enter 2nd number");
		int no2=sc.nextInt();
		System.out.println("Enter Aithmetic Operator");
		switch(sc.next()) {
		
		case "+":System.out.println("The sum of "+no1 + " and "+no2+ " is "+(no1+no2));
		         break;
	    case "-":System.out.println("The Difference of "+no1+ " and "+no2+ " is "+(no1-no2));
			     break;
		case "*":System.out.println("The Product of "+no1+" and "+no2+" is "+no1*no2);
		         break;
		         
		case "/":try {
			      System.out.println("The Division of "+no1+" and "+no2+" is "+no1/no2);
		          }
		         catch(ArithmeticException e) {
			         System.out.println("we can't divide with zero");
		         }
		         break;
		default:System.err.println("Enter valid operator");
		}
		
	}
}
