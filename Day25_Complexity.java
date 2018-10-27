package Hackerrank;

import java.util.Scanner;

public class Day25_Complexity {
	
	public static String isPrime(int number) {
		if (number == 0 || number == 1)
			return "Not prime";
		
		for (int i=2; i*i<=number; i++) {
	        if(number%i==0) {
	            return "Not prime";
	        }
	    }
	    return "Prime";
	}

	public static void main(String[] args) {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println(isPrime(arr[i]));
        }
        scan.close();
	}
	
}
