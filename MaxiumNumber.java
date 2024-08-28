package IfElse;
import java.util.Scanner;
public class MaxiumNumber {
	public void MaxiNum() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number 2");
		
		
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 +" is greater");
		}
		else {
			System.out.println(num2 + "is greater");
		}

		
	}
	public static void main(String args[]) {
		MaxiumNumber m = new MaxiumNumber();
		m.MaxiNum();
	}
	

}
