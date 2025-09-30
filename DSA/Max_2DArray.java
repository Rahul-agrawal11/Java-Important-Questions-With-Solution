class Max_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,4,7},
            {2,5,18},
            {3,6,9}
        };
        System.out.println(Max2DArray(arr));
    }

    static int Max2DArray(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                if (num[j] > max) {
                    max = num[j];
                }
            }
        }
        return max;
    }
}