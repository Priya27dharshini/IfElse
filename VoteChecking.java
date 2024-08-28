package IfElse;
import java.util.Scanner;
public class VoteChecking {

	Scanner scan = new Scanner(System.in);
	public void checker() {
	System.out.println("Enter the age");
	
	int age = scan.nextInt();
	
	
	if(age >=18 && age <=90) {
		System.out.println("You are eligible for vote");
	}
	else if (age < 18) {
		System.out.println("You are under 18, not eligible to vote");
	}
	else{
		System.out.println("You enter invalid input");
	}
	}
	
	public static void main(String args[]) {
		VoteChecking vc = new VoteChecking();
		vc.checker();
	}
}
