import java.util.ArrayList;
// Lexographically 
class LongestString {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        
        String max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if  (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        System.out.print(max);
    }
}
