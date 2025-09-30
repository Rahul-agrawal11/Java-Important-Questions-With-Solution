
class SearchInInfinite {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5 ,7, 8, 12, 13, 17, 18, 20, 24, 26, 29, 30, 35, 39, 45, 50, 53, 59, 480};
        int target = 24;
        int index = answer(arr, target);
        System.out.println(index);
    }

static int answer(int[] arr, int target) {
    int start = 0;
    int end = 1;

    while (target > arr[end]) {
        int newStart = end + 1;
        end = end + (end - start + 1) *2;
        start  = newStart;
    }
    return binarySearch(arr, target, start, end);
}

static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = 0;
        while (start <= end) {
             mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return mid;
    }
}
