package conditional;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
public static void main(String[] args) {
		
		ArrayList<String> myCars = new ArrayList<String>();
		// to assign value
		myCars.add("Audi");
		myCars.add("XUV300");
		myCars.add("Bmw");
		System.out.println(myCars);
		//to sort the values
		Collections.sort(myCars);
		System.out.println(myCars);
		
}
}