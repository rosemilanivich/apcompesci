/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		michael.raiseSalary(20);
		double x = michael.getAnnualSalary();
		
		Employee dwight = new Employee(1111,"Dwight","Schrute",222.22);
		dwight.employeeToString();
		dwight.raiseSalary(20);
		double y = dwight.getAnnualSalary();
		
		Employee pam = new Employee(2011,"Pam","Beesly",2250.0);
		pam.employeeToString();
		pam.raiseSalary(20);
		double z = pam.getAnnualSalary();
	}
}
