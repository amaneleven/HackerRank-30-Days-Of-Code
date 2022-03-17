import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge          PUT THIS CODE IN THIS SECTION 👇🏻
          age = initialAge;       
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:            PUT THIS CODE IN THIS SECTION 👇🏻
            if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
              
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
        }
    }


	public void yearPasses() {
  		// Increment this person's age.                   PUT THIS CODE IN THIS SECTION 👇🏻
          age++;
	}

	public static void main(String[] args) {                      //DONT TOUCH HERE ITS ALL GOOD .
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
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
