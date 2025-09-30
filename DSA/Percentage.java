import java.util.Scanner;

public class Percentage
{
	public static void main(String[] args) {
		System.out.println("Calculating Percentage - ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject1 Marks: ");
		int a = sc.nextInt();
		System.out.println("Enter Subject2 Marks: ");
		int b = sc.nextInt();
		System.out.println("Enter Subject3 Marks: ");
		int c = sc.nextInt();
		System.out.println("Enter Subject4 Marks: ");
		int d = sc.nextInt();
		System.out.println("Enter Subject5 Marks: ");
		int e = sc.nextInt();
		
		if (a>100 || b>100 || c>100 || d>100 || e>100) {
		    System.out.println("Number should not be greater than 100");
		}
		else {
		    float total = a+b+c+d+e;
		    float percentage = ((total/500) * 100);
		    System.out.println("The Percentage is: "+ percentage+"%");
		}
		
		
	}
}