import java.util.ArrayList;

class ReverseOfArrayList {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(1);
        list.add(42);
        list.add(29);
        list.add(32);
        list.add(21);
        System.out.println("Original list: " + list);

        // Reverse the list using swap
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            swap(list, start, end);
            start++;
            end--;
        }

        System.out.println("Reversed list: " + list);
    }

    static void swap(ArrayList<Integer> l, int start, int end) {
        int temp = l.get(start);
        l.set(start, l.get(end)); 
        l.set(end, temp);         
    }
}
