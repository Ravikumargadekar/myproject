package conditional;

public class Palindrome {

	public static void main(String[] args) {
		String str1 = "refer";
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {

			str2 = str2 + str1.charAt(i);

		}
		System.out.println("String1 ::" + str1);
		System.out.println("String2 ::" + str2);
		// to check given string palindrome

		if (str1.equals(str2)) {
			System.out.println("it is a palindrome");
		} else {

			System.out.println("it is not a palindrome");
		}
	}

}
