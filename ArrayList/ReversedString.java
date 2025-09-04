import java.util.ArrayList;

class ReversedString {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> reversedList = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.print(reversedList);
    }
}
