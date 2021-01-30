package conditional;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter any one character from -RGB");
		String myColor=sc.nextLine();
		switch(myColor.toUpperCase())
{ 
		case "R":
		System.out.println("Your choice is :RED");
		break;
		case "B":
			System.out.println("Your choice is :BLUE");
			break;
		case "G":
			System.out.println("Your choice is :GREEN");
			break;
		default:
			System.out.println("Invalid Entity");
}
		

		
		
	}

}
