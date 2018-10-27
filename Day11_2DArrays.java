package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Day11_2DArrays {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];
        int sum[] = new int[16];
        int l = 0;

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                sum[l] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                l++;
            }
        }
        
        Arrays.sort(sum);
        int maximum = sum[15];
        
        System.out.println(maximum);

        scanner.close();
    }

}
