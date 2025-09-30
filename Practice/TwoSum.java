class TwoSum {
    static int[] twosum(int[] a, int target, int left, int right) {
        while (left < right) {
            int current_sum = a[left] + a[right];
            if (current_sum == target) {
                return new int[]{left, right};
            } else if (current_sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // no pair found
    }

    public static void main(String[] args) {
        int[] a = {10, 15, 23, 28, 29, 33, 36, 44};
        int target = 57;
        int[] result = twosum(a, target, 0, a.length - 1);
        System.out.println(result[0] + " " + result[1]);
    }
}
