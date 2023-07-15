package questionpractice;

import java.util.Scanner;

public class PallendromicString {
  
	
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr word!!");
		String word=sc.nextLine();
		boolean ans=matchingWord(word);
		System.out.println(ans+" word is pallendromic !! ");
	}
	
	public static boolean matchingWord(String word) {
		boolean k=false;
		
		for(int i=word.length()-1;i>0;i--) {
			if(word.charAt(i)==word.charAt((word.length()-1)-i)){ 
				
				k=true;
			}
		
		}
		return k;
	}
}
