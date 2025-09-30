class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 18, 25, 56};
        int target = 1;
        int ans = FloorNumber(arr, target);
        System.out.println(ans);
    }

    static int FloorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // int mid = 0;
        // if (target < arr[0]) {
        //     return -1;
        // }
        while (start <= end) {
             int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}