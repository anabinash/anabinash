package questionpractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumberList {
	
	
	public static int findDifference(int a, int b) {
		  if(a<b) {
			  return b-a;
		  }
		  return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of the element");
		int len=sc.nextInt();
		List<Integer> lst=new ArrayList<>();
	
		for(int i=0;i<len;i++) {
			lst.add(sc.nextInt());
		}
        int dif=findDifference(lst.get(0), lst.get(1));
        for(int j=0;j<len-1;j++) {
        	int c1=lst.get(j);
        	int c2=lst.get(j+1);
        	if((c2-c1)>dif) {
                 System.out.println("Missing elements is="+ (c1+dif));		  
        	}
        }    
	}

}
