package IfElse;
import java.util.Scanner;
public class Vowel {
	
	Scanner scan = new Scanner(System.in);
	
	public void display() {
		System.out.println("Enter the character");
		String c = scan.nextLine();
		
		if(c.equals("a")){
			System.out.println(c+ " is a Vowel");
		}
		else if(c.equals("e")) {
			System.out.println(c+ " is a Vowel");
		}
		else if (c.equals("i")) {
			System.out.println(c+ " is a Vowel");
		}
		else if (c.equals("o")) {
			System.out.println(c+ " is a Vowel");
		}
		else if (c.equals("u")) {
			System.out.println(c+ " is a Vowel");
		}
		else {
			System.out.println(c + " is a Consonant");
		}
	}

	public static void main(String args[]) {
		Vowel v = new Vowel();
		v.display();
	}
}
