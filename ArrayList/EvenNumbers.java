// Remove all even numbers from an ArrayList.

import java.util.ArrayList;
class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(1);
        list.add(42);
        list.add(29);
        list.add(32);
        list.add(21);
        System.out.println(list);
        
        System.out.println("Even Numbers are: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}