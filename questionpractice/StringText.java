package questionpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringText {
	
	public static int getGCD(int n1, int n2) {
		
//		if(n2==0) {
//			return n1;
//		}
//		else {
//			return getGCD(n2, n1%n2);
//		}
//		
//	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
	    String name="AaaaBBBbbCCcccDDddd";
		
		Pattern pt=Pattern.compile(name);
		System.out.println("u r name !!!");
		String userName=sc.nextLine();
		Matcher mt=pt.matcher(userName);
//		boolean match=mt.matches();
         
//		System.out.println( match);		
//		int[] arr= {36,60};
//		int gcd=arr[0];
//		for(Integer ele:arr) {
//			gcd=getGCD(gcd,ele);
//			System.out.println(gcd);
//			
		System.out.println(mt.group(1));
		
	}
	

}
