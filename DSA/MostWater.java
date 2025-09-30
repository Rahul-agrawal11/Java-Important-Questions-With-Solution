// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// class MostWater {
//     public static void main(String[] args) {
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         int n = height.length;
//         int i, j, a;
//         int max_area = 0;
//         for (i = 0; i < n; i++) {
//             for (j = i+1; j < n; j++) {
//                 int l = Math.min(height[i],height[j]);
//                 int b = j - i;
//                 a = l * b;
//                 max_area = Math.max(a, max_area);
//                 // if (max_area < a) {
//                 //     max_area = a;
//                 // }
//             }
//         }
//         System.out.println(max_area);
//     }
// }     O(n^2)


class MostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int n = height.length;
        int i = 0; 
        int j = n-1;
        int max_area = 0;  

        while (i < j) {
            int l = Math.min(height[i], height[j]);
            int w  = j - i;
            int a = l * w;

            if (max_area < a) {
                max_area = a;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(max_area);
    }
}