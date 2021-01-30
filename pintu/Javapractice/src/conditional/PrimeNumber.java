package conditional;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int cnt;
	System.out.println("printing prime number from 1 to 20");
	
	//loop throw the number one by one
	for(int n=1;n<=20;n++) {
		cnt=0;
		//to check if the number is prime
	for(int i=1;i<=n;i++) {
		
		if(n% i==0) {
			cnt++;
		}
	}
		if(cnt==2) {
			System.out.print(n+",");
		}
	
		
	}
		
		

	}

}
