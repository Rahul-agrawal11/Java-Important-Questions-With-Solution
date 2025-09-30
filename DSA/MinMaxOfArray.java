class MinMaxOfArray {
    public static void main (String[] args) {
        int[] arr = {10,5,6,7,2,1,11};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Minimum value: "+min);
        System.out.println("Maximum value: "+max);
    }
}