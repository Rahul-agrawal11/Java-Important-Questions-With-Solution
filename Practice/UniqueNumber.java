// Works when all numbers except one are present twice in the array

class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 5, 4, 3, 2};
        
        System.out.println("Unique Number is: " + ans(arr));
    }
    
    static int ans(int[] arr) {
        int unique = 0;
        
        for (int n : arr) {
            unique ^= n;
        }
        
        return unique;
    }
}