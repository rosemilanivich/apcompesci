/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Theres an alien exchange program");
        System.out.println("pick an alien");
        System.out.println("1.) Eoe, evil alien who doesn't like you");
        System.out.println("2.) Weesd, kind but simple alien");
        System.out.println("3.) Tuuq, very cool");
        int answer1=sc.nextInt();
        if(answer1==1){
            System.out.println("you picked Eoe,,, yikes");
        }
        else if(answer1==2){
            System.out.println("you picked Weesd, cool");
        }
        else if(answer1==3){
            System.out.println("you picked Tuuq, HORRAY");
        }
        else{
            System.out.println("you are given oool");
        }
        System.out.println("do you want to give your alien an education?");
        System.out.println("press 1 for yes, 2 for no");
        int answer2=sc.nextInt();
        if(answer2==1){
            System.out.println("your alien now has an education and is questioning it's rights");
        }
        else if(answer2==2){
            System.out.println("your alien doesn't like you");
        }
        System.out.println("do you want to set your alien free?");
        System.out.println("press 1 for yes, 2 for no");
        int answer3=sc.nextInt();
        if(answer3==1){
            System.out.println("your alien looks back solemly with bag tied onto stick in hand, then leaves and never turns back");
        }
        else if(answer3==2){
            System.out.println("your alien leaves through the window one chilly night never to be seen again");
        }
        }
	}