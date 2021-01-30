package conditional;

public class DuplicateElement1 {
	
public static void main(String args[]) {
	

	
int a[] = {2,3,5,6,7,8,2};
int b[] = {1,3,5,7,9,8,6};

for(int i=0;i<=a.length-1; i++) {
for(int j=0;j<=b.length-1;j++) {
	
	if(a[i]==(b[j])) {
		
		System.out.println(a[i]);
}
}	
}
}
}
