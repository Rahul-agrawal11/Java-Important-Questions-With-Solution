public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1 << (n - 1); // 2^(n-1)

        System.out.println("Number of elements in row " + n + " of Pascal's Triangle): " + ans); // Output: 16
        
    }
}