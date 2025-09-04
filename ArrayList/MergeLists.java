import java.util.ArrayList;

class MergeLists {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> copyList = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        
        copyList.add("Ram");
        copyList.add("Shyam");
        copyList.add("Vinayak");
        
        for (int i = 0; i < copyList.size(); i++) {
            list.add(copyList.get(i));
        }
        System.out.print(list);
    }
}
