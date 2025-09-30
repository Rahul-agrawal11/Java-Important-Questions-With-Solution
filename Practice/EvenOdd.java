import java.util.Scanner;

class EvenOdd {
    static boolean isEven(int N) {
        return N % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int N = sc.nextInt();
        if (isEven(N)) {
            System.out.println("True");
        } 
        else{
            System.out.println("False");
        }
    }
}