package jobrole;

import java.util.Scanner;

public class mainChecker {

	public static void main(String[] args) throws wrongAgefound {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int userA=sc.nextInt();
		System.out.println("Enter education in capital lettter");
		String userE=sc.nextLine();
		userdata(userA,userE);
		
	        
	}
	public static void userdata(int data, String education) throws wrongAgefound {
      	if(data<19) {
      		throw new wrongAgefound("you are not perfect age");
      		
      	}
      	else {
      		checkAge.agecheckermachine(data, education);
      	}
           		
 	}

}
class wrongAgefound extends Exception{
	wrongAgefound(String msg){
		super(msg);
	}
	
}
