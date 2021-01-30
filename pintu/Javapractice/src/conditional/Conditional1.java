package conditional;

import java.util.Scanner;

public class Conditional1 {
	
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a,b,c values and it shoud not be equal");
		
		int a = Scan.nextInt();
		int b = Scan.nextInt();
		int c = Scan.nextInt();
		if(a>b && a>c)
		{
			
			System.out.println("A is greter ");
		}
		else if(b>c)
		{
			System.out.println("B is greter");
			
		}
		else 
			System.out.println("C is greter");
	}

}
