package arthmetic;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
	
		//create object for scanner class
		Scanner sc=new Scanner(System.in);
		//to read name
		System.out.println("Enter your name");
		String myName =sc.nextLine();
		System.out.println("Entered name is:"+myName);
		//to read no. of days
		System.out.println("Enter no. of days to get a job");
		int myDays  = sc.nextInt();
		
		System.out.println("Target days are:"+myDays);
		
		

	}

}
