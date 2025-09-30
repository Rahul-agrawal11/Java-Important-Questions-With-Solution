class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int base = 5;
        int result = 0;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            result += last * base;
            base = base * 5;
        }

        System.out.println("The magic number is: " + result); // Output: 150
    } 
}