class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 14, 12, 16, 7,2,15};
        int secondLargest = arr[0];
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest ) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number.");
        }
        else {
            System.out.println("Second largest: "+ secondLargest);
        }
    }
}