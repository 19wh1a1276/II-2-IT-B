// Java Program to sort strings in alphabetical order......
import java.util.Arrays;
import java.util.Scanner;

public class sorted_string {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = scan.next();
		char[] c= s.toCharArray();
		Arrays.sort(c);
		System.out.print("Sorted string : ") ;
		System.out.println(c);
	}
}