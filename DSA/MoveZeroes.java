// class MoveZeroes {
//     public static void main(String[] args) {
//         int[] nums = {1, 0, 2, 0, 3};
//         int[] nums2 = new int[nums.length];
//         int k = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nums2[k] = nums[i];
//                 k++;
//             }
//         }
//         for (int j = 0; j < nums2.length; j++) {
//             System.out.println (nums2[j]);
//         }
//     }
// }


class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;  
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}

class MoveZeroes {
    public static void main(String[] args) {
        Solution sc = new Solution();
        int nums[] = {1,0,2,0,3};
        sc.moveZeroes(nums);

        for(int num:nums) {
            System.out.println();
        }
    }
}