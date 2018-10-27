package Hackerrank;

public class Day10_BinaryNumbers {

	public static void main(String[] args) {
		int x = 262141;
		int current = 0;
		int maximum = 0;
		
		String new_x = Integer.toBinaryString(x);
		
		for (int i=0; i<new_x.length(); i++) {
			char character = new_x.charAt(i);
				if (character == '1') {
					current += 1;
				} else {
					maximum = Math.max(maximum, current);
					current = 0;
				}
		}
		
		System.out.println(Math.max(maximum, current));
	}

}