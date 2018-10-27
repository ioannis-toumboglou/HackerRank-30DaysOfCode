package Hackerrank;

import java.util.Scanner;

public class Day01_AddElements {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "Hackerrank ";
		
		Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int user_int;
        double user_double;
        String user_string;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.print("Please enter an integer: ");
        user_int = scan.nextInt();
        scan.nextLine();
        System.out.print("Please enter a double: ");
        user_double = scan.nextDouble();
        scan.nextLine();
        System.out.print("Please enter a string: ");
        user_string = scan.nextLine();
        
        
        /* Print the sum of both integer variables on a new line. */
        user_int = user_int + i;
        System.out.println(user_int);
        /* Print the sum of the double variables on a new line. */
		user_double = user_double + d;
        System.out.println(user_double);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        String new_string = s + user_string;
        System.out.println(new_string);
        scan.close();
	}

}
