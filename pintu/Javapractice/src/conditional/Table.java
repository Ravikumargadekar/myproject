package conditional;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		//to read user input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any Number");
	int n= sc.nextInt();
	sc.close();
	//to print table upto 10
	for(int i=1;i<=10;i++) {
		//5*1=5
		System.out.println(n+"*"+i+"="+(n*i));
		
	}
}
}