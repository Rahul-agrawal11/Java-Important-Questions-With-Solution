public class GetBit {
    public static void main (String[] args) {
        int n = 5;  // binary: 0101
        int position = 0;
        System.out.println(getBit(n, position));
    }

    static int  getBit (int n, int position) {
        // return (n & (1 << position));  // give the bit at the given position
        return (n & (1 << position)) == 0 ? 0 : 1;  // to return 0 or 1
    }
}