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
		System.out.println("give me another bigger number");
		int number2=sc.nextInt();
		System.out.println("your range is "+number+" to "+number2);
		System.out.println("here are 5 other numbers in the range");
		int w=((int)(Math.random()*number2-number)+number);
		int o=((int)(Math.random()*number2-number)+number);
		int u=((int)(Math.random()*number2-number)+number);
		int e=((int)(Math.random()*number2-number)+number);
		int x= ((int)(Math.random()*number2-number)+number);
		System.out.print(w+" "+o+" "+u+" "+e+" "+x+" ");
	}
}
