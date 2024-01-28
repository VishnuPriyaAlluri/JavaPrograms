package numberprograms;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
     public static void main(String[] args) {
    	 //generating random number
		Random random=new Random();
		int otp=random.nextInt(1,100);
		System.out.println(otp);
		if(!dummy(otp)) {
			System.out.println("Timedout");
			
		}
		
     }
     
     
     public static boolean dummy(int otp) {
		for(int i=1;i<=5;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int no=sc.nextInt();
			if(check(otp,no)) {
				System.out.println("The number of attempts is "+i);
				return true;
				
			}
		}
		return false;
		
	}
     //checking number
     public static boolean check(int otp,int no) {
    	 if(otp==no) {
    		 System.out.println("correct");
    		 return true;
    	 }else if(otp>no){
    		 System.out.println("too low");
    		 return false;
    	 }else {
    		 System.out.println("too high");
    		 return false;
    	 }
     }
}
