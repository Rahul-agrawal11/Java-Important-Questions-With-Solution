
import java.util.Scanner;

class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello "+name+" ,have a good day.");
    }
}