package conditional;

import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
	
	String stGrade="";
	int stMarks;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student marks");
	stMarks=sc.nextInt();
	if(stMarks>=90) {
		
		stGrade ="A";
	}
	else if (stMarks<=80) {
		
		stGrade="B";

	}
	
	else if(stMarks>=70) {
		stGrade="c";
	}
	else {
		stGrade="d";
	}
System.out.println("student marks are:"+stMarks);
System.out.println("student Grade is:"+stGrade);
}

}
