class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 14, 30};
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE)
            System.out.println("No second smallest element.");
        else
            System.out.println("Second smallest: " + second);
    }
}
