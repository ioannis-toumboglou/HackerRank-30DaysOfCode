package Hackerrank;

import java.util.Scanner;

public class Day07_Arrays {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        String output = "";

        for (int i = arr.length-1; i >= 0 ; i--) {
            int element = arr[i];
            String newElement = element + " ";
            output += newElement;
        }
        
        System.out.println(output);
        
        scanner.close();
    }

}
