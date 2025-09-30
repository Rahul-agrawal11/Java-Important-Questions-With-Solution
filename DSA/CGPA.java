import java.util.Scanner;

class CGPA {
    public static void main(String[] args) {
        System.out.println("Calculating Percentage - ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject1 Marks: ");
		int marks_of_sub1 = sc.nextInt();
		System.out.println("Enter Subject2 Marks: ");
		int marks_of_sub2 = sc.nextInt();
		System.out.println("Enter Subject3 Marks: ");
		int marks_of_sub3 = sc.nextInt();

        if (marks_of_sub1>100 || marks_of_sub2>100 || marks_of_sub3>100) {
            System.out.println("Marks should not greater than 100.");
        }

        else {
            float total = marks_of_sub1 + marks_of_sub2 + marks_of_sub3;
            float percentage = ((total/300)*100);
            float CGPA = percentage/10;
            System.out.println("The CGPA is: "+ CGPA);
        }

    }
}