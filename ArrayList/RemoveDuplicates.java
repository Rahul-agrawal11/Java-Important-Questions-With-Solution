import java.util.ArrayList;

class RemoveDuplicates {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        list.add("Chirag");
        list.add("Vishnu");
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.print(list);
    }
}
