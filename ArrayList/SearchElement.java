import java.util.ArrayList;
import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(1);
        list.add(42);
        list.add(29);
        list.add(32);
        list.add(21);
        System.out.println(list);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                System.out.print(i);
            } 
        }
    }
}