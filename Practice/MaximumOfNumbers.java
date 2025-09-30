
import java.util.Scanner;

class MaximumOfNumbers {
    static int greater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2: ");
        int num2 = sc.nextInt();
        int ans = greater(num1, num2);
        System.out.println(ans + " is greater.");   
    }
}