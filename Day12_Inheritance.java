package Hackerrank;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int idNumber, int[] scores) {
    	super(lastName, lastName, idNumber);
    	this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScores = scores;
        
        char result = calculate();
        
        System.out.println("Name: " + firstName + ", " + lastName);
        System.out.println("ID: " + idNumber);
        System.out.println("Grade: " + result);
     }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int sum = 0;
        for (int i=0; i<testScores.length; i++) {
            sum += testScores[i];
        }
        int result = sum / testScores.length;
        
        if (result < 40) {
            return 'T';
        } else if (result >= 40 && result < 55) {
            return 'D';
        } else if (result >= 55 && result < 70) {
            return 'P';
        } else if (result >= 70 && result < 80) {
            return 'A';
        } else if (result >= 80 && result < 90) {
            return 'E';
        } else {
            return 'O';
        }
    }
}

class Day12_Inheritance {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}