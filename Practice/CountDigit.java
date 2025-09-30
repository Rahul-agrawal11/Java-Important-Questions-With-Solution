class CountDigit {
    static int count(int n) {
        int countN = 0;
        int i = 0;
        if(n > 0) {
            while (i < n) {
                n /= 10;
                countN++;
            }
        }
        return countN;
    }
    public static void main(String[] args) {
        int n = 1234;
        int ans = count(n);
        System.out.println(ans);
    }
}