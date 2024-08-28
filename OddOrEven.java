package IfElse;

import java.util.Scanner;

public class OddOrEven {
	 public void checkOddOrEven() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int num = scan.nextInt();
		 
		 if((num & 1 ) == 0){
			 System.out.println("The given number is even");
		 }
		 else {
			 System.out.println("The given nunber is odd");
		 }
	 }
	 
	 public static void main(String args[]) {
		 
		 
		
		 OddOrEven e = new OddOrEven();
		 e.checkOddOrEven();
		 
	 }
	

}


