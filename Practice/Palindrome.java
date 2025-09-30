
import java.util.Scanner;

class Palindrome {
    static int reverseNumber(int n) {
        
        int i = 0;
        int reverse = 0;
        if (n == 1) return 1;
        while (i < n) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int ans = reverseNumber(num);
        int original = num;
        if (original == ans) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}