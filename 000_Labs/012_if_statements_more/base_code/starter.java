/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give me a number");
		int num1=sc.nextInt();
		System.out.println("give another number");
		int num2=sc.nextInt();
		if(num1==num2){
			System.out.println("your numbers are equal");
		}
		else{
			System.out.print("your numbers are different");
		}
	}
}
