package alammatter;

import java.util.Scanner;

public class PrintANumber{
	public static void main (String[] args) {
		
		//creates a reader instance which takes
		//input from standard input - keyboard
		@SuppressWarnings("resource")
		Scanner  reader = new Scanner(System.in);
		System.out.println("enter a number:");
		
		//nextInt()reads the next integer from the keyboard
		int number = reader.nextInt();
		
		//printIn() prints the following line to the output screen
		System.out.println("You entered: " + number);
		
	}

}
