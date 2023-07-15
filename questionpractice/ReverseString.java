package questionpractice;

public class ReverseString {

	public static String reverse(String str) {
		  String rev = "";
		  char[] finalarray = str.toCharArray();
		  for (int i = finalarray.length - 1; i >= 0; i--)
		    rev += finalarray[i];
		  return rev;
		}
	public static void main(String arg[]) {
		 String name="Capgemini";
		 String answer=reverse(name);
		 System.out.println(answer);
	}
}
