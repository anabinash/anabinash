package jobrole.controller;

import java.util.Scanner;

import jobrole.dao.Laptops;
import jobrole.service.LaptopService;
import jobrole.service.LaptopServiceImpl;

public class LaptopController {

	Scanner sc=new Scanner(System.in);
	
	LaptopService laptopserviceimpl=new LaptopServiceImpl();
	
	
    public void insertlaptops(Laptops laptop) {
    	System.out.println("add your laptops brand");
    	String brand=sc.nextLine();
    	laptop.setBrand(brand);
    	System.out.println("add the laptop color");
    	String color=sc.nextLine();
    	laptop.setColor(color);
    	System.out.println("add the price");
    	Integer price=sc.nextInt();
    	laptop.setPrice(price);
    	
    	laptopserviceimpl.addlaptops(laptop);
    	
    }
	
}
