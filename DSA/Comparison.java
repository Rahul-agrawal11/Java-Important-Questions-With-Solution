
import java.util.Scanner;


class Comparison {
    public static void main(String[] args) {
        int num1 = 25;
        System.out.println("Enter the number:" );
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Number is greater than user entered number.");
        } else {
            if (num1 == num2) {
            System.out.println("Both the numbers are equal.");
            } else {
                System.out.println("Number is smaller than user entered number.");
            }
        }
    }
}