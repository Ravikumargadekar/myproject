
public class Dtatype {
	
	public static void main(String[] args) {
		
		byte myByte = 127;
		
		System.out.println("my byte is :"+myByte);
		
		String str= "Livetech";
		System.out.println(str.length());
		
		//to read 'L'
		String str1 = "Livetech";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		
		System.out.println(str.charAt(str.length()-1));
		
		//to find index "t"
		System.out.println(str.indexOf("t"));
		
		
		System.out.println(str.equals("Livetech"));
		
		System.out.println(str.equals("livetech"));
		 
		System.out.println(str.equalsIgnoreCase("livetech"));
		
		//to concat the string
		
		String str2 = "live";
		String str3 = "tech";
		System.out.println(str2.concat(str3));
		
		
		System.out.println(str2+str3);
		
		// to read substring from main string
		
		String str4="madhukarqait";
		
		System.out.println(str4.substring(8));
		
		System.out.println(str4.substring(8,9));
		
		System.out.println(str4.substring(8,10));
		
		
	}
	

}
