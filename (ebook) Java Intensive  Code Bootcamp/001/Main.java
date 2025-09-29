package fun.sanjibsinha;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		// Declaring a String variable to hold user input
		String inputString;
		
		// Creating a Scanner object to read input from the console (System.in)
		Scanner consoleIn = new Scanner(System.in);
		
		// Prompting the user for input
		Systemout.println("Enter a string: ");
		
		// Reading the entire line of input from the console
		inputString = consoleIn.nextLine;
		
		// Displaying the inut back to the user
		System.out.println("You entered string: " +inputString);
	}
}