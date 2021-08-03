package week1.assignments;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		
		// Here is the input
				String test = "changeme";
				String test2 = test.toUpperCase();
				char test1[] = test2.toCharArray();
				System.out.println("New one conflict");
				for (int i=0; i<test1.length ; i++) {
					if(i%2==0) {
						System.out.print(test.charAt(i));
					}
					else {
						System.out.print(test1[i]);
					}
				}
		//Build a logic  to change the odd index to uppercase (output:cHaNgEmE)
				/* Pseudo Code: 
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) find the odd index within the loop (use mod operator)
				d) within the loop, change the character to uppercase if the index is odd else don't change
				   (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);
			*/
				

	}

}
