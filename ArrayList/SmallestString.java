// Find the minimum (lexicographically smallest) string from the ArrayList.

import java.util.ArrayList;

class SmallestString {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        
        String min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if  (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        System.out.print(min);
    }
}
