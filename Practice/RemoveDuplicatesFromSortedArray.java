class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int n = arr.length;
        int x = 0;
        for (int i = 1; i < n; i++) {
                if (arr[i] != arr[x]) {
                    x += 1;
                    arr[x] = arr[i];
                }
            }
        // System.out.println(Arrays.toString(arr));
        System.out.println(x+1);
    }
}