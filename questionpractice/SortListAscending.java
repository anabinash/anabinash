package questionpractice;

import java.util.Arrays;

public class SortListAscending {

	public static void main(String[] args) {
		 int[]inputArray={2,4,0,1,56,23,4} ;
		 int ans[]=sortTheElements(inputArray);
		 for(Integer i:ans) {
			 System.out.print(i);
		 }

	}
	public static int[] sortTheElements(int []array) {
		 
		 Arrays.sort(array);
		 return array;
	}

}
