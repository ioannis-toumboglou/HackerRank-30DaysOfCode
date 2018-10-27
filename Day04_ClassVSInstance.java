package Hackerrank;

import java.util.*;

class APerson {
    int age;
  
	public APerson(int initialAge) {
        
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
	}

	public void amIOld() {
  		if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 18) {
            System.out.println("You are old.");
        } else {
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void yearPasses() {
  		age += 1;
	}
}

public class Day04_ClassVSInstance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			APerson p = new APerson(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

}
