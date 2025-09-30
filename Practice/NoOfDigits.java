public class NoOfDigits {
    public static void main (String[] args) {
        int n = 10;
        int base = 2;

        int result = (int)(Math.log(n) / Math.log(base)) + 1;

        System.out.println("Number of digits in " + n + " when represented in base " + base + " is: " + result); // Output: 4
    }
}