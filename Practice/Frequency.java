
class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,5,3,6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }
}