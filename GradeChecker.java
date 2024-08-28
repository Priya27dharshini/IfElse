package IfElse;
import java.util.Scanner;
public class GradeChecker {
	
	String studName;
	String dep;
	int m1;
	int m2; 
	int m3;
	int total;
	double avg;
	char grade;
	
	Scanner scan = new Scanner(System.in);
	public void display() {
	System.out.println("Enter your name");
	studName = scan.next();
	System.out.println("Enter your department");
	dep = scan.next();
	System.out.println("Enter your Mark 1");
	m1 = scan.nextInt();
	System.out.println("Enter your Mark 2");
	m2 = scan.nextInt();
	System.out.println("Enter your Department");
	m3 = scan.nextInt();
	

	}
	
	public void total() {
		total = m1+m2+m3;
		System.out.println("Total is "+ total);
	}
	public void average() {
		avg = total/3;
	}
	
	public void grade() {
		if(total >=90) {
			System.out.println("Grade A");
		}
		else if (total >=80 && total <=89) {
			System.out.println("Grade B");	
		}
		else if (total >=70 && total <=79) {
			System.out.println("Grade C");
		}
		else if (total >=60 && total <=69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
	}
	
	public static void main(String args[]) {
		
		GradeChecker gc = new GradeChecker();
		gc.display();
		gc.total();
		gc.average();
		gc.grade();
	}
}
