
/* Calculate the perimeter and area of various classrooms at Grand Circus based on user input
 * Lab1 October 24, 2016. 1st Day of Class
 * Prompt the user to enter values of length and width of the classroom. 
 * Display the area and perimeter of that classroom. 
 * Ask if the user wants to continue (keep measuring rooms). 
 * Assume the rooms are perfect rectangles. 
 * Assume that the user will enter valid numerical data for length and width. 
 * Accept decimal entries. 
 * @author DanielChristiansen 
 */
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);      
		
		Scanner sc = new Scanner(System.in);
		
		double width = 0;
		double length = 0;
		double area = length * width;
		double perimeter = (2 * (width + length));

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {  //while loop using equalsIgnoreCase method so "y" or "Y" will work

		System.out.print("Please enter room length: "); // user inputs length
		length = in.nextDouble();                      // double allows decimals 

		System.out.print("Please enter room width: "); // user inputs width, also a double
		width = in.nextDouble();
		System.out.println();

		// Calculates area W * L
		System.out.println("The area of the room is:  " + (width * length));

		// Calculates perimeter 2(W + L)
		System.out.print("The perimeter of the room is: " + (2 * (width + length)));
		System.out.println();
		System.out.println();

		
			System.out.print("Would you like to continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		sc.close();
		System.out.println("Goodbye!");

	}

}
