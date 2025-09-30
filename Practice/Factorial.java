
import java.util.Scanner;

class Factorial {
    static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n  = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
}