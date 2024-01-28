package conceptprograms;

import java.util.Scanner;

public class ConvertCelsiusToForenheat {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//convert celsius to forenheat
//	System.out.println("enter temperture in celsius");
//	double celsius=sc.nextDouble();
//	double forenheat=(celsius*9/5)+32;
//	System.out.println("temperature in forenheat is "+forenheat);
	
	//convert forenheat to celsius
	System.out.println("enter temperature in forenheat");
	double forenheat=sc.nextDouble();
	double celsius=(forenheat-32)*5/9;
	System.out.println("temperature in celsius is "+celsius);
}
}
