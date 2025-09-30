import java.util.Arrays;
class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapped(arr, last, maxIndex);
        }
    }

    static void swapped(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
    
