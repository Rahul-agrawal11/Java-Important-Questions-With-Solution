import java.util.ArrayList;

class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(1);
        list.add(42);
        list.add(92);
        list.add(32);
        System.out.println("ArrayList is: "+list);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum Value: "+max);
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println("Minimum Value: "+min);
    }
}