package IfElse;
import java.util.Scanner;
public class NumberCheck {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		if(n > 0) {
			System.out.println("The given number is Positive");
		}
		else if (n == 0){
			System.out.println("The given number is Zero");
		}
		else {
			System.out.println("The given number is Negative");
		}
	}
}
