package numberprograms;

import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter valid roman number");
		String str=sc.next();
		convertRomanToDecimal(str);
	}

	private static void convertRomanToDecimal(String str) {
		int sum=0,i=0,j=0;
		for(int k=str.length()-1;k>=0;k--) {
			char ch=str.charAt(k);
			switch(ch) {
			case 'i':{
				       i=1;
				       break;
			          }
			case 'v':{
				     i=5;
				     break;
			         }
			case 'x':{
				     i=10;
				     break;
			         }
			case 'l':{
				      i=50;
				      break;
			         }
			case 'c':{
				     i=100;
				     break;
			         }
			case 'd':{
			        i=500;
				      break;
			         }
			case 'm':{
				     i=1000;
				     break;
			         }
			
			}
			if(i>=j) {
				sum=sum+i;
				j=i;
			}else if(i<j) {
				sum=sum-i;
				j=i;
			}
		}
		System.out.println(sum);
		
	}
}
