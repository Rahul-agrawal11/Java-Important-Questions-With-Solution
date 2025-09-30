class GCD {
    static int Gcd (int a, int b) {
        // int common = 1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int ans = Gcd(a, b);
        System.out.println(ans);
    }
}