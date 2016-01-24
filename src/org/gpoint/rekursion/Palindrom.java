package org.gpoint.rekursion;

public class Palindrom {

	public static void main(String[] args) {
		
		String palindrom = "anna annA!";
		
		System.out.println(check(palindrom));
		

	}
	
	public static boolean check(String pal) {
		if (pal.length() <= 1) {
			return true;
		}
		
		char first = Character.toLowerCase(pal.charAt(0));
		char last = Character.toLowerCase(pal.charAt(pal.length()-1));
		
		if (Character.isLetter(first) && Character.isLetter(last)) {
			if (first == last) {
				return check (pal.substring(1, pal.length()-1));
			}
		}
		if (!Character.isLetter(first)) {
			return check (pal.substring(1, pal.length()));
		}
		if (!Character.isLetter(last)) {
			return check (pal.substring(0, pal.length()-1));
		}
		return false;
	}

}
