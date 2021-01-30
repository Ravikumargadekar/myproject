package arthmetic;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
	ArrayList<String>  myCars = new ArrayList<String>();
	myCars.add("Audi");
	myCars.add("Benz");
	myCars.add("bmw");
	System.out.println("number of values are:"+myCars.size());
	//to read each value using for loop
	for(int i=0; i<=myCars.size()-1;i++) {
		System.out.println(myCars.get(i));
		}
	System.out.println("*******************");
	//using for each
	for(String mycar:myCars) {
System.out.println(mycar);
}
}
}