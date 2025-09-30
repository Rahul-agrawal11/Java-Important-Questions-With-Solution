
import java.util.Arrays;

class linearSearch2Darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,4,7},
            {2,5,8},
            {3,6,9}
        };
        int target = 6;
        int[] ans = linearSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}