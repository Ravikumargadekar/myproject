package conditional;

public class FibonacciNumber {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	int c=a+b;
	while(c <=100) {
		System.out.println(c);
		//swap the value
		
	a=b;
	b=c;
	c=a+b;
		
	}
	
}
	
}
