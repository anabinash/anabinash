package questionpractice;

import java.util.Scanner;

public class OccuranceFind {
	
	public static void main(String arg[]) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        System.out.print("Enter the letter to count: ");
	        char occ_letter = scanner.nextLine().charAt(0);
	        
	        int occurrenceCount = countOccurrence(inputString, occ_letter);
	        System.out.println("The letter '" + occ_letter + "' occurs " + occurrenceCount + " times in the string.");
	        
	        scanner.close();
	    
	   
	}
	 public static int countOccurrence(String string, char letter) {
	        int count = 0;
	        
	        for (char c : string.toCharArray()) {
	            if (c == letter) {
	                count++;
	            }
	        }
	        
	        return count;
	
	 }
	

}
