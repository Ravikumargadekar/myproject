package arthmetic;

public class ArrayDeclaration {

	public static void main(String[] args) {
		//Array declaration
	String[] myCars = new String[3];
	//to assign value
	myCars[0]= "Audi";
	myCars[1]= "Benz";
	myCars[2]= "Bmw";
	//to find number of value in an array
	System.out.println("number of value are:"+myCars.length);
	//to read values from an array using index
	System.out.println(myCars[0]);
	System.out.println(myCars[1]);
	System.out.println(myCars[2]);
	System.out.println("********************");
	//to read values from an array using for loop
	for(int i=0;i<=myCars.length-1;i++) {

		System.out.println(myCars[i]);
	}
	System.out.println("*******************");
	//to read values from an array using for each
	for(String myCar:myCars) {
		System.out.println(myCar);
	}

}
}
