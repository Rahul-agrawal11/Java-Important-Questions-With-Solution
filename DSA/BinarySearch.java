// You have given a sorted array [4,7,16,19,21] and target t print the index where t present.

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,7,16,19,21}; // Sorted Array 
        int target = 21;
        // for (int i = 0; i < arr.length; i++) {
        //     if (target == arr[i]) {
        //         System.out.println("Index of target is: "+ i);
        //     }
        // }
        int mid,low,high;
        low = 0;
        high = arr.length-1;
        while(low<=high) {
            mid = (low + high)/2;
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid]<target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

    }
}