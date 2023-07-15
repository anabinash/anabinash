package jobrole.client;

import jobrole.controller.LaptopController;
import jobrole.dao.Laptops;

public class Client {
      
	
	public static void main(String arg[]) {
		LaptopController lc=new LaptopController();
		Laptops laptop=new Laptops();
	    lc.insertlaptops(laptop);
	}
	
	
}
