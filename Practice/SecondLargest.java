// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 15, 23, 26, 14, 36, 39, 25, 48};
        int max1 = 0;
        int max2 = 0;
        if (a[0]>a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }
        
        for (int i = 2; i < a.length;i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println(max2);
        System.out.println(max1);
    }
}