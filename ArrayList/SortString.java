// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class SortString {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        list.add("Pushpendra");
        int n = list.size();
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted list: " + list);
    }
}








