package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		name = new String("frankie");
		age = 8;
		breed = new String("yorkshire terrier");
	}
	public Dog(String n, int a, String b){
		name = n;
		age = a;
		breed = b;
	}
	
	public String dogName(){
		return name;
	}
	
	public int dogAge(){
		return age;
	}

	public String dogBreed(){
		return breed;
	}

}
