package conditional;

public class TimeOccurence {

	public static void main(String[] args) {

		String str = "LiveTech";
		int cnt = 0;
//System.out.println(str.length());
		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == 'e') {

				cnt++;
				System.out.println("index of e is:" + i);

			}

		}
		System.out.println("number of timese occurence i in a given string is:" + cnt);

	}

}
