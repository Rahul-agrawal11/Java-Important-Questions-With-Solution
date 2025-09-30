// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Prime number in an array
class PrimeNumberOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,5,8,997};
        int j;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=0 && arr[i] == 1) {
                continue;
            }
           for (j = 2; j < arr[i]; j++) {
               if (arr[i] % j == 0) {
                   break;
               }
           }
           if (arr[i] == j) {
            System.out.println(arr[i]);
           }
        }
    }
}