package Hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class Day08_Phonebook {

	public static void main(String[] args) {
		HashMap <String,String> phonebook = new HashMap<>(); 
		Scanner scan = new Scanner(System.in);
		
		// Enter the number of entries
		System.out.print("Please enter the number of entries: ");
		int n = scan.nextInt();
		scan.nextLine();
		String[] words;
		
		// Get user input until the number of entries is reached
		for (int count=1; count <= n; count++) {
			String userInput = scan.nextLine();
			words = userInput.split("\\s+");
			String name = words[0];
			String number = words[1];
 			phonebook.put(name, number);	// First element name, second element phone number
		}
		
		
		// Search and return entries based on name
		for (int count=1; count <= n; count++) {
			String userInput = scan.next();
			
			if (phonebook.containsKey(userInput)) {
				System.out.println(userInput + '=' + phonebook.get(userInput));
			} else {
				System.out.println("Not found");
			}
		}
		scan.close();
	}

}