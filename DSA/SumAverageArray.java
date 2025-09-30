class SumAverageArray {
    public static void main(String[] args) {
        int[] arr = {10,15,12,14,20};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average); 
    }
}