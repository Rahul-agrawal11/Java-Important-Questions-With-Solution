class SetBit {
    public static void main(String[] args) {
        int number = 5; // Binary: 0101
        int position = 1; // We want to set the bit at position 1

        int newNumber = setBit(number, position);
        System.out.println("Original number: " + number); // Output: 5
        System.out.println("New number after setting bit at position " + position + ": " + newNumber); // Output: 7 (Binary: 0111)
    }

    public static int setBit(int num, int pos) {
        return num | (1 << pos);
    }
}