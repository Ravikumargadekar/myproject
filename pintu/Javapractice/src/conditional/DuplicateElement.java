package conditional;

public class DuplicateElement {

	public static void main(String[] args) {
	   //Initialize array
		int arr[] = {2,1,1,3,4,6,4,6} ;
		
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			
			//Searches for duplicate element
			
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}	
		
	}
}
