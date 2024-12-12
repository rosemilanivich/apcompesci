/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give me a number");
		int number=sc.nextInt();
		System.out.println("these are the next five numbers.");
		System.out.print(number+1);
		System.out.print(number+2);
		System.out.print(number+3);
		System.out.print(number+4);
		System.out.println(number+5);
		System.out.println("here are the multiples");
		System.out.print(number*1);
		System.out.print(number*2);
		System.out.print(number*3);
		System.out.print(number*4);
		System.out.println(number*5);
		System.out.println("Here is "+number+" divided by 100");
		System.out.println(number/100.0);
		System.out.println("Here is "+number+" divided by 10");
		System.out.print(number/10.0);
	}
}
