// Java Program to Convert char to String and String to Char......
import java.util.Scanner;

public class StringVsChar {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter a character : ");
		char n = scan.next().charAt(0) ;
		String s = String.valueOf(n);
		System.out.println("Converting Char to String type.......");
		System.out.println("Entered character converted to string : " + s) ;
		System.out.print("Enter a string : ");
		String s1 = scan.next();   
		System.out.println("Converting String to Char type.......");
		for(int i1=0; i1<s1.length();i1++){  
		        char c = s1.charAt(i1);  
		        System.out.println("char at "+i1+" index is: "+c);  
		} 
		
	}
}