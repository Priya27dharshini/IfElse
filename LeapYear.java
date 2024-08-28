package IfElse;
import java.util.Scanner;
public class LeapYear {
	
		 public void checkLeapYear() {
			 Scanner scan = new Scanner(System.in);
			 System.out.println("Enter the Year");
			 int year = scan.nextInt();
			 
			 if(year % 4 ==0) {
				 System.out.println("The given Year is Leap Year");
			 }
			 else {
				 System.out.println("The given Year is Non-Leap Year");
			 }
		 }
		 
		 public static void main(String args[]) {
			 
			 LeapYear yl = new LeapYear();
			 yl.checkLeapYear();
			 
		 }
		

	}



