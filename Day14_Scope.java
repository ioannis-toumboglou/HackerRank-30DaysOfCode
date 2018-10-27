package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	// Add your code here
  	// Copy items from input array to elements
    public Difference(int[] arr){
    	elements = arr;
    }
    
    // Find the maximum difference between elements' items
    public void computeDifference() {
        int minimum = 0;
        int maximum = 0;

        Arrays.sort(elements);
        minimum = elements[0];
        maximum = elements[elements.length-1];
        maximumDifference = Math.abs(maximum - minimum);
    }
}
    

public class Day14_Scope {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
