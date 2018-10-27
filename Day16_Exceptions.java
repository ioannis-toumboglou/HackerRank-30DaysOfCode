package Hackerrank;

import java.util.Scanner;

public class Day16_Exceptions {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
            int number = Integer.parseInt(S);
            System.out.println(number);
        }
        catch (Exception e) {
            System.out.println("Bad String");
        }
        in.close();
    }

}
