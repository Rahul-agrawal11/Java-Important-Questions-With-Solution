
import java.util.Scanner;

// class LinearSearch {
//     public static void main(String[] args) {
//         int arr[] = {5,7,9,6,12,16};
//         int target = 9;
//         for (int i = 0; i<arr.length; i++) {
//             if (target == arr[i]) {
//                 System.out.println("Index: "+i);
//             }
//         }
//     }
// }
class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of an Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements: ");
        System.out.print("Array: [");
        for (int j = 0; j < arr.length; j++) { 
                System.out.print(" "+arr[j]+" ");
            }
            System.out.println("]");
        System.out.print("Enter the element for search: ");
        int target = sc.nextInt();
        for (int k = 0; k < arr.length; k++) { 
            if (target == arr[k]) {
                System.out.println("Index of target: "+k);
            } 
        }
    }
}