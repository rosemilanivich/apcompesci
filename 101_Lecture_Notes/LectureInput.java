/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("give me a number");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("give me a 2nd number");
        int number2 = sc.nextInt();
        sc.nextLine();
        int sum= (number1+number2);
        System.out.println(sum);
        System.out.print("favorite food please ");
        String food=sc.nextLine();
	}
}