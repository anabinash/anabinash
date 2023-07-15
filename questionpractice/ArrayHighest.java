package questionpractice;

public class ArrayHighest {

	
	 public static int thirdhighest(int arra[]){
	        int temp;
	        for(int i=0; i<arra.length;i++){
	            for(int j=i+1;j<arra.length;j++){
	                  if (arra[i] > arra[j])   
	                {  
	                    temp = arra[j];  
	                    arra[j] = arra[i];  
	                    arra[i] = temp; 
	                    System.out.println(temp +" "+arra[i]+" "+ arra[j]);
	                }  
	            }
	        }
	        return arra[arra.length-1];
	    }
	public static void main(String arg[]) {
		
		 int arr[]={1,3,6,8,7};
	      int answer=thirdhighest(arr);
	      System.out.println("The third highest is="+answer);
	}
}
