package week1.assignment.optional;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				int count = 0;
				char[] text11 = text1.toUpperCase().toCharArray();
				char[] text12 = text2.toUpperCase().toCharArray();
				if(text1.length() == text2.length()) {
				for(int i=0; i<text12.length ; i++) {
					if(text11[i] == text12[text11.length - i-1]) {
						count = count+1;
					}
				}
				}
				if (count == text11.length) {
					System.out.println("Matched");
				}
				else {
					System.out.println("Not Matched");
				}
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */

	}

}
