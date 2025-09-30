public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;

        // A number is a power of two if it has exactly one bit set in its binary representation.
        // This can be checked using the expression (n & (n - 1)) == 0, which will be true for powers of two.
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(n + " is a power of two: " + isPowerOfTwo); // Output: true
    }
}