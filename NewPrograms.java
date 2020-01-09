package com.cts.oops;

public class NewPrograms {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"
	
	*/
		String s =new String("Global Warming");
		
	
		System.out.println(s.substring((s.length()-4),s.length()));
		System.out.println(s.substring(4, 9));
		System.out.println(s.matches("[A-Za-z0-9]+"));
		System.out.println(s.substring(0,(s.length()-4)));
		System.out.println(s.substring(4,s.length()));
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf("Wa"));
		
		
		
		
		
		
		
		
		
		
	}
}
