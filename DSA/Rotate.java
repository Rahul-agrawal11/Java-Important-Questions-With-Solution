class Rotate{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int left = 2;
        int[] temp = new int[left];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}