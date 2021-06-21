// Java Program to find quotient and remainder......
import java.util.Scanner;

public class quotient_remainder {
	public static void main(String[] args){
		int dividend, divisor, quotient, remainder;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter dividend : ") ;
		dividend = scan.nextInt() ;
		System.out.print("Enter divisor : ");
		divisor = scan.nextInt() ;
		quotient = dividend / divisor ;
		remainder = dividend % divisor ;
		System.out.println("Quotient is: " + quotient) ;
		System.out.println("Remainder is: " + remainder);
	}
}