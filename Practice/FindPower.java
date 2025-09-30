public class FindPower {
    public static void main(String[] args) {
        int n = 3;
        int power = 6;

        int ans = 1;

        while (power > 0) {
            if ((power & 1) != 0) { // If power is odd
                ans = ans * n;
            }
            n = n * n; // Square the base
            power = power >> 1; // Divide power by 2
        }

        System.out.println("Result: " + ans); // Output: 729
    }
}