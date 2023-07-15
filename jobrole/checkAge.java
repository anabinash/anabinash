package jobrole;

public class checkAge {
          public static String agecheckermachine(int age, String edu) {
        	     if(age>=21 && (edu.toUpperCase() .charAt(0)=='M')) {
        	    	  return "You  are as a junior Devops" ;
        	     }
        	     else if(age>=26 && (edu.toUpperCase() .charAt(0)=='M' ||edu.toUpperCase() .charAt(0)=='M')) {
        	    	 return "You are the senior Devops";
        	     }
        	     else {
        	    	 return "plz something wrong!!";
        	     }
          }
}
