package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day28_RegExPatterns {
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        ArrayList<String> names = new ArrayList<>();

	        for (int NItr=0; NItr<N; NItr++) {
	            String[] firstNameEmailID = scanner.nextLine().split(" ");
	            String firstName = firstNameEmailID[0];
	            String emailID = firstNameEmailID[1];
	            
	            if (emailID.endsWith("@gmail.com")) {
	            	names.add(firstName);
	            }
	        }
	        
	        Collections.sort(names);
	        
	        for (String name : names) {
	        	System.out.println(name);
	        }

	        scanner.close();
	    }

}
