package atm.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import atm.controller.AtmController;
import atm.dao.AtmDAO;

public class Client {

	Map<Integer ,AtmDAO> map=new HashMap<>();
	static Integer money=0;
	
	public static void main(String arg[]) {
		
		Scanner scc=new Scanner(System.in);
		System.out.println("1.Account Openning  \n 2.AC details");
		
		System.out.println("<<<<<<Enter your choice >>>>>>>>>>");
		Integer choice=scc.nextInt();
		
		AtmController atmcontroller=new AtmController();
		
		Map<Integer,AtmDAO> cashdetails=atmcontroller.getaccountdetails();
		
		if(choice==1) {
			atmcontroller.addcustomer();
		}
		else {
			System.out.println("1.Cashwithdraw \n 2.Cash Deposite \n 3. Balance Enquary \n 4.exist");
			Integer choose=scc.nextInt();
			
			switch(choose) {
			case 1:
				System.out.println("{ Cash withdraw }");
				
				System.out.println("Enter your password !");
				Integer password=scc.nextInt();
				if(cashdetails.containsKey(password)) {
					System.out.println("enter account no");
					Integer acNo=scc.nextInt();
					
					System.out.println("Enter your withdraw amount $");
					Integer amount=scc.nextInt();
					
				     if(money >amount) {
						money=money-amount;
					}
					
				break;	
				}
			case 2:
				System.out.println("Deposite your amount !!");
				System.out.println("Enter your password !");
				Integer Dpsw=scc.nextInt();
				
				if(cashdetails.containsKey(Dpsw)) {
					System.out.println("Enter your Deposite amount $");
					Integer Deposite_amount=scc.nextInt();
					money=money+Deposite_amount;
					System.out.println("amount deposite successfully !!");
				}
				break;
				
			case 3:
				  System.out.println(money);
				break;
			}
		}
		
		
	}
}
