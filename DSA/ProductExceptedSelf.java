public class ProductExceptedSelf {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 3};
        int[] pre = new int[arr.length];
        int[] post = new int[arr.length];
        int i;
        int product = 1;
        int product1 = 1;
        pre[0] = 1;
        for (i = 1; i < arr.length; i++) {
            product *= arr[i-1];
            pre[i] = product;
            System.out.print(pre[i]+" ");
        }
        System.out.println();
        
        post[arr.length-1] = 1;
        for (int j = arr.length-2; j >= 0; j--) {
            product1 *= arr[j+1];
            post[j] = product1;
            System.out.print(post[j] + " ");
        }
        System.out.println();
        
        int[] result = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            result[k] = pre[k] * post[k];
            System.out.print(result[k] + " ");
            
        }
        
        
    }
}