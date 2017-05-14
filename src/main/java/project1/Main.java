package project1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("what is your name: ");
		String name = scan.nextLine();
		
		System.out.println("what is your surname: ");
		String surname = scan.nextLine();
		
		System.out.println("Hello " + "'"+name+" "+surname+"'" +",\nwelcome to Java world");
		scan.close();
		
		System.out.println("Program ended!!!");
		
	}

}
