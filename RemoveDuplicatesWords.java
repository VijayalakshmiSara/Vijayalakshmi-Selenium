package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
		String text2;
		String[] text3 = text.split(" ");
		String[] text1 = text.split(" ");
		for(int i=0; i<text1.length; i++) {
			count = 0;
			for(int j=0; j<text3.length ;j++) {
				if(text1[i].contentEquals(text1[j]) && i>=j) {
					count = count+1;
				}
			}
			if(count>1) {
				text2 = text.replace(text1[i], "");
				System.out.println(text2);
			}
			
		}
		/*
		 * Pseudo code 
		 * a) Split the String into array and iterate over it 
		 * b) Initialise another loop to check whether the word is there in the array 
		 * c) if it is available then increase and count by 1. 
		 * d) if the count > 1 then replace the word as "" 
		 * e) print the each word
		 */

	}

}
