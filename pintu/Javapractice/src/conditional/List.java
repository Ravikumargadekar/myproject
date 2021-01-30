package conditional;

import java.util.ArrayList;

public class List {
public static void main(String[] args) {
	ArrayList<String>   myCars  = new ArrayList<String>();
	//to assign value
	myCars.add("Audi");
	myCars.add("Benz");
	myCars.add("Bmw");
System.out.println("number of values are :"+myCars.size());
	System.out.println(myCars.get(1));//Benz
	//to change the value
	myCars.set(1, "XUV300");
	System.out.println(myCars.get(1));//XUV300
	System.out.println(myCars.size());//3
	//to remove the value
	myCars.remove(1);
	System.out.println(myCars.size());//2
	//to clear all the value
	myCars.clear();
	System.out.println(myCars.size());//0
	
	
	
	
}
}
