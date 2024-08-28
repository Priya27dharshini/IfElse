package IfElse;
import java.util.Scanner;
public class MaxiThree {
	
		public void MaxiNum() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the number 1");
			int num1 = scan.nextInt();
			System.out.println("Enter the number 2");
			int num2 = scan.nextInt();
			System.out.println("Enter the number 3");
			int num3 = scan.nextInt();
			
			if(num1 > num2) {
				System.out.println(num1 +" is greater");
			}
			else if(num2 > num3){
				System.out.println(num2 + " is greater");
			}
			else {
				System.out.println(num3 +" is greater");
			}

			
		}
			public static void main(String args[]) {
				MaxiThree m = new MaxiThree();
				m.MaxiNum();
			}
		
		

	}



