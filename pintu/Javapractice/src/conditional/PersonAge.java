package conditional;

import java.util.Scanner;

public class PersonAge {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your ege");
		int age =sc.nextInt() ;
		if(age<18) {
			
			System.out.println("You are not eligible to work");
		}
	
		else if(age>=18 && age<=60) {
			
			System.out.println("you are elegible to work");
			
		}
		else {
			
			System.out.println("you are to old to work as per gov rule");
		}
	}

}
