class ResetBit {
    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int position = 3; // Position to reset (0-indexed from the right)

        int mask = ~(1 << position);
        // process of resetting the bit
        // 1. left shift 1, position times
        // 2. take one's complement of the number obtained in step 1
        // 3. AND the number with the number obtained in step 2
        // This will reset the bit at the given position to 0

        int result = number & mask;
        // Alternatively, you can use the method below
        // int result = resetBit(number, position);
        
        System.out.println("Original number: " + number); // Output: 29
        System.out.println("Number after resetting bit at position " + position + ": " + result); // Output: 21 // Binary: 10101
    }
}