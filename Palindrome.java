package week1.assignment.optional;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "madam";
				//Declare another String rev
				String rev = "";
				for(int i=text.length()-1; i>=0 ; i--) {
					rev = rev+text.charAt(i);
				}
				
				if (text.equals(rev)) {
					System.out.println("Matched");
				}
				else {
					System.out.println("Not Matched");
				}
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */

	}

}
