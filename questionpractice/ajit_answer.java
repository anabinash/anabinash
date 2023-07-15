package questionpractice;

import java.util.List;

import questionpractice.Implementation.Vehcile;

public class ajit_answer{
	  
	
	
	public static void main(String[] args) throws Exception {
		Vehcile v=new Vehcile("Jaguar", 100000000);
		Implementation i=new Implementation(); 
		System.out.println(i.checkBudget(v));
		System.out.println(i.reviewForTestDrive(v));
		
	}

}
interface xxyyzz{
    String checkBudget(Vehcile v)throws Exception ;
    String reviewForTestDrive(Vehcile vv)throws Exception;
	
}

class Implementation implements xxyyzz
{
	public String checkBudget(Vehcile v)throws Exception
	{
		
		if(v.model_budget<100000) {
		throw new LowBudgetException("LowBudget");
		}
		else {
			return "option is avialable!!!";
		}
		
		
		
		
	}
	public  String reviewForTestDrive(Vehcile vv)throws Exception {
		
		try {
		 checkBudget(vv);
		 return vv.model_no;
		 
		 
		}
		catch(LowBudgetException e) {
		return "Budget is too low for the options";
		}
		catch(Exception e) {
			return "General exception";
		}
		 
	 }
}



class Vehcile{
	String model_no;
	int model_budget;
	
	Vehcile(String model_no,int model_budget){
		this.model_no=model_no;
		this.model_budget=model_budget;
	}	
	
}
class LowBudgetException extends Exception{
	LowBudgetException(String msg){
		super(msg);
	}
	
}

