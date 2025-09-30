import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        sorting(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] sorting(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap adjacent elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
