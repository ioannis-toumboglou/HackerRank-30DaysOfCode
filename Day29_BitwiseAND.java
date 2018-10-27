package Hackerrank;

import java.util.Scanner;

public class Day29_BitwiseAND {
	
	private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr=0; tItr<t; tItr++) {
            String[] nk = scan.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            
            int bitAND = 0;
            int maxBitSum = 0;
            
            for (int i=1; i<n; i++) {
            	for (int j=2; j<=n; j++) {
            		if (i!=j) {
            			bitAND = i&j;
            			if (bitAND > maxBitSum && bitAND < k) {
            				maxBitSum = bitAND;
            			}
            		}
            	}
            }
            System.out.println(maxBitSum);
        }
        scan.close();
    }

}
