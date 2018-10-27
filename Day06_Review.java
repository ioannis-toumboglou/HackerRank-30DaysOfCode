package Hackerrank;

import java.util.Scanner;

public class Day06_Review {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfWords = scan.nextInt();
        scan.nextLine();
        int count = 0;
        
        while (count < numberOfWords) {
            String word = scan.nextLine();
            String firstWord = "";
            String secondWord = "";
            
            for (int i=0; i <= word.length()-1; i++) {
                if (i%2 == 0) {
                    char character = word.charAt(i);
                    firstWord += character;
                } else {
                    char character = word.charAt(i);
                    secondWord += character;
                }
            }
            System.out.println(firstWord + " " + secondWord);
        }
        scan.close();
    }

}
